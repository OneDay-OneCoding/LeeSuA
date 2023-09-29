import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] numbs = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            numbs[i] = Integer.toString(numbers[i]);
        }
        
        Arrays.sort(numbs, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        
        if(numbs[0].equals("0")){
            return "0";
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < numbs.length; i++){
            sb.append(numbs[i]);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}