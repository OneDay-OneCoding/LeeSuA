import java.util.*;

class Solution {
    public long solution(long n) {
        String s = Long.toString(n);
        
        int[] arr = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            arr[i] = s.charAt(i)-'0';
        }
        Arrays.sort(arr);
        
        StringBuilder answer = new StringBuilder();
        
        for(int i = s.length()-1; i >= 0; i--){
            answer.append(arr[i]);
        }
        
        String conv = String.valueOf(answer);
        long a = Long.valueOf(conv);

        return a;
    }
}