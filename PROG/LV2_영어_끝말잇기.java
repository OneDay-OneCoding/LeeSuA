import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        boolean isEnd = false;
        int number = 0, index = 0;
        HashSet<String> wordSet = new HashSet<String>();
        
        char end = words[0].charAt(0);
        
        for(int i = 0, size = words.length; i < size; i++){
            String now = words[i];
            if(wordSet.contains(now) || end != now.charAt(0)){
                isEnd = true; // i = 3 -> 
                number = (i+1)%n;
                if(number == 0) number = n;
                index = i/n+1;
                break;
            }
            
            wordSet.add(now);
            end = now.charAt(now.length()-1);
        }
        if(!isEnd){
            number = 0;
            index = 0;
        }
        int[] answer = {number, index};
        return answer;
    }
}