import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < skill.length(); i++){
            map.put(skill.charAt(i), i);
        }
        
        for(int i = 0; i < skill_trees.length; i++){
            String s = skill_trees[i];
            int index = 0;
            boolean check = true;
            for(int j = 0; j < s.length(); j++){
                if(map.containsKey(s.charAt(j))){
                    if(map.get(s.charAt(j)) == index++)  continue;
                    else{
                        check = false;
                        break;
                    }
                }
            }
            if(check)   answer++;
        }
        return answer;
    }
}