import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> result = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%divisor == 0) result.add(arr[i]);
        }
        
        int[] answer = new int[result.size()];
        
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        
        Arrays.sort(answer);
        
        int[] none = {-1};
        if(answer.length == 0) return none;
        
        return answer;
    }
}