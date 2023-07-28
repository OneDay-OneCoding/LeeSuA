class Solution {
    public String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++){
            if(i%2 == 0)    sb.append("¼ö");
            else sb.append("¹Ú");
        }
        
        answer = sb.toString();
        return answer;
    }
}