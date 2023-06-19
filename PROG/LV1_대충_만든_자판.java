import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < keymap.length; i++){
            for(int j = 0; j < keymap[i].length(); j++){
                char now = keymap[i].charAt(j);
                if(map.containsKey(now)){
                    if(map.get(now) > j+1) map.put(now, j+1);
                }
                else map.put(now, j+1);
            }
        }
        for(int i = 0; i < targets.length; i++){
            int size = targets[i].length();
            int cnt = 0;
            for(int j = 0; j < size; j++){
                if(map.containsKey(targets[i].charAt(j))){
                    cnt = cnt + map.get(targets[i].charAt(j));
                }
                else {
                    cnt = -1;
                    break;
                }
            }
            answer[i] = cnt;

        }
        return answer;
    }
}