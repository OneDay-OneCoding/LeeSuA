class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        for(int i = 0; i < arr.length-1; i++){
            answer = lcm(answer, arr[i+1]);
        }
        return answer;
    }
    
    public int lcm(int a, int b){
        if(a > b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        int cnt = 1;
        int result = a;
        while(true){
            result = a * cnt;
            cnt++;
            if(result%b == 0){
                return result;
            }
        }
    }
}