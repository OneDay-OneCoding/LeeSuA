import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(i==j) continue;
                set.add(numbers[i]+numbers[j]);
                
            }
        }
        
        int[] answer = new int[set.size()];
        
        Iterator<Integer> it = set.iterator();

        for(int i = 0; i < answer.length; i++){
            answer[i] = it.next();
        }
        
        Arrays.sort(answer);
        return answer;
    }
}