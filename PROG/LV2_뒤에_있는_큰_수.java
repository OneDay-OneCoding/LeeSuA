import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i = numbers.length-1; i >= 0; i--){
            int number = numbers[i];
            answer[i] = -1;
            
            while(!stack.empty()){
                int top = stack.peek();
                if(top > number){
                    answer[i] = top;
                    break;
                }
                stack.pop();
            }
            stack.add(number);
        }
        return answer;
    }
}