import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for(int i = score.length; i >= 0;){
            i = i-m;
            if(i < 0) break;
            answer = answer + score[i]*m;
        }
        return answer;
    }
}