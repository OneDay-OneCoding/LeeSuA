class Solution {
    public int[] solution(int[] num_list) {
        int max = num_list.length-1;  
        int[] answer = new int[max+2];
        
        for(int i = 0; i < max+1; i++){
            answer[i] = num_list[i];
        }
        
        if(num_list[max] > num_list[max-1]) answer[max+1] = num_list[max]-num_list[max-1];
        else    answer[max+1] = num_list[max]*2;
        
        return answer;
    }
}