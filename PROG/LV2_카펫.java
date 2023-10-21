class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int width = 1, height = 1;
        for(int i = 3; i < 10000; i++){
            for(int j = 3; j < 10000; j++){
                if(2*i + 2*(j-2) == brown && (i-2)*(j-2) == yellow){
                    answer[0] = j;
                    answer[1] = i;
                    break;
                }
            }
        }
        //brown = 2*가로 + 2*(세로-2)
        //yellow = (가로-2)*(세로-2)
        if(answer[1] > answer[0]){
            int tmp = answer[1];
            answer[1] = answer[0];
            answer[0] = tmp;
        }
        return answer;
    }
}