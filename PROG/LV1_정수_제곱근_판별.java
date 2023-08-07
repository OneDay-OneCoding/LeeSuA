class Solution {
    public long solution(long n) {
        long answer = 0;
        double a = Math.sqrt(n);
        
        long b = (long)Math.sqrt(n);
        
        if(Math.floor(a) != a) answer = -1;
        else answer = (b+1)*(b+1);
        
        return answer;
    }
}