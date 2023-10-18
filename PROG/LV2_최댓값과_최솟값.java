import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        
        String[] numbers = s.split(" ");
        
        for(int i = 0; i < numbers.length; i++){
            int now = Integer.valueOf(numbers[i]);
            if(max < now)   max = now;
            if(min > now)   min = now;
        }
        
        answer = min + " " + max; 
        
        return answer;
    }
}