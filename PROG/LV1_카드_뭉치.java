import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int index1 = 0, index2 = 0;
        int size1 = cards1.length, size2 = cards2.length;
        for(int i = 0, size = goal.length; i<size; i++){
            if(index1 < size1 && goal[i].equals(cards1[index1])) index1++;
            else if(index2 < size2 && goal[i].equals(cards2[index2])) index2++;
            else{
                answer = "No";
                break;
            }
        }
        return answer;
    }
}