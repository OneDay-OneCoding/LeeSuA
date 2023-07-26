import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int top = arr[0];
        List<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(top != arr[i])   {
                list.add(arr[i]);
                top = arr[i];
            }
        }   
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}