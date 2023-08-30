class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int first = 2*a*b;
        int second = Integer.valueOf(Integer.toString(a) + Integer.toString(b));
        
        if(first >= second)    answer = first;
        else answer = second;
        return answer;
    }
}