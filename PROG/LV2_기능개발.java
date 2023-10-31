import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int size = progresses.length;
        List<Integer> list = new ArrayList<>();
        int[] day = new int[size];
        
        for(int i = 0; i < size; i++){
            int tmp = (100-progresses[i])/speeds[i];
            if((100-progresses[i])%speeds[i] > 0) tmp++;
            day[i] = tmp;
        }
        int top = day[0];
        int index = 0;
        list.add(1);
        for(int i = 1; i < size; i++){
            if(top >= day[i]){
                list.set(index, list.get(index)+1);
            }
            else{
                list.add(1);
                top = day[i];
                index++;
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}