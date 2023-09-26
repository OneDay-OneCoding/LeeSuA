import java.util.*;
class Solution {
    public int solution(String t, String p) {
        
        int answer = 0;
        int length = p.length();
        long number = Long.valueOf(p);
        
        for(int i = 0; i < t.length()-length+1; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = i; j < i+length; j++){
                sb.append(t.charAt(j));
            }
            String s = String.valueOf(sb);
            
            if(Long.valueOf(s) <= number)   answer++;
        }
        
        
        return answer;
    }
}