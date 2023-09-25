class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 2;
        while(n >= 1){
            n = n/a;
            a++;
            answer++;
        }
        return answer;
    }
}