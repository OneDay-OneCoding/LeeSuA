class Solution {
    static int[] fib = new int[100001];
    public int solution(int n) {        
        fib[0] = 0;
        fib[1] = 1;
        
        for(int i = 2; i < 100001; i++){
            fib[i] = fib[i-1]%1234567 + fib[i-2]%1234567;
        }
        
        int answer = fib[n]%1234567;
        
        return answer;
    }

}