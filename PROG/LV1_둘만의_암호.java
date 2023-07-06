import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < skip.length(); i++){
            set.add(skip.charAt(i));
        }
        
        for(int i = 0; i < s.length(); i++){
            int now = s.charAt(i);
            for(int j = 0; j < index; j++){
                now = now+1;                      
                if((char)now > 'z') now = 'a';
                if(set.contains((char)now)) j--;
            }
            answer.append((char)now);
                    
        }
        
        String ans = answer.toString();
        return ans;
    }
}