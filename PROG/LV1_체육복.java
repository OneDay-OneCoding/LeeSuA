import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        boolean[] possible = new boolean[31];
        
        Arrays.sort(lost);

        for(int i = 0; i < reserve.length; i++){
            possible[reserve[i]] = true;
        }
        
        for(int i = 0; i < lost.length; i++){
            int number = lost[i];
            
            if(possible[number]){
                possible[number] = false;
                answer++;
                lost[i] = -1;
            }
        }
        
        for(int i = 0; i < lost.length; i++){
            int number = lost[i];
            
            if(number > 0 && possible[number-1]){
                possible[number-1] = false;
                answer++;
            }
            
            else if(possible[number+1]){
                possible[number+1] = false;
                answer++;
            }
        }
        return answer;
    }
}