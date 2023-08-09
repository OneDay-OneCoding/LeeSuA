class Solution {
    public int[] solution(long n) {
        String s = Long.toString(n);
        int length = s.length();
        int[] answer = new int[length];
        for(int i = 0; i < length; i++){
            answer[i] = s.charAt(length-i-1)-'0';
        }
        
        return answer;
    }
}