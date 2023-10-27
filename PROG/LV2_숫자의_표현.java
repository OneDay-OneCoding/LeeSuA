class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++){
            int now = i;
            int cnt = i+1;
            while(now < n){
                now = now + cnt;
                cnt++;
            }
            if(now == n)    answer++;
        }
        
        return answer;
    }
}