import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int[] number = new int[10000001];
        for(int i = 0; i < tangerine.length; i++){
            number[tangerine[i]]++;   
        }
        
        Arrays.sort(number);
        int cnt = 10000000;

        while(k > 0){
            k = k - number[cnt--];
            answer++;
        }
        return answer;
    }
}