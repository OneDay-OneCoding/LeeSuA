import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        boolean flag = false;
        
        Arrays.sort(d);
        for(int i = 0, size = d.length; i < size; i++){
            sum = sum + d[i];
            if(sum > budget){
                answer = i;
                flag = true;
                break;
            }
        }
        
        if(!flag)   answer = d.length;
        return answer;
    }
}