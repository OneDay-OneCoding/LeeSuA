class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for(int i = 0; i < s.length(); i++){
            char now = s.charAt(i);
            if(now == ' '){
                sb.append(" ");
                index = 0;
            }
            else if(index%2 == 0){
                sb.append(Character.toUpperCase(now));
                index++;
            }
            else{
                sb.append(Character.toLowerCase(now));
                index++;
            }
        }
        
        String answer = sb.toString();
        
        return answer;
    }
}