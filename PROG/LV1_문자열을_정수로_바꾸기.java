class Solution {
    public int solution(String s) {
        int answer = 0;
        String tmp = "";
        for(int i = 1; i < s.length(); i++){
            tmp = tmp + s.charAt(i);
        }
        
        if(s.charAt(0) == '-'){
            answer = 0 - Integer.valueOf(tmp);
        }
        else if(s.charAt(0) == '+'){
            answer = Integer.valueOf(tmp);
        }
        else{
            answer = Integer.valueOf(s);
        }
        return answer;
    }
}