class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++){
            if(yak(i)%2 == 0) answer = answer + i;
            else answer = answer - i;
        }
        return answer;
    }
    
    public int yak(int num){
        int result = 0;
        for(int i = 1; i <= num; i++){
            if(num%i == 0) result++;
        }
        return result;
    }
}