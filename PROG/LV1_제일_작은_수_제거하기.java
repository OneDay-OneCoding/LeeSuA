import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int index = 0;
        int min = arr[0];
        
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
                index = i;
            }
        }
        
        int[] answer = new int[arr.length-1];
        
        
        for(int i = 0; i < arr.length-1; i++){
            if(i >= index)   answer[i] = arr[i+1];
            else answer[i] = arr[i];
            
        }
        
        
        if(arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
        }

        
        return answer;
    }
}