class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] number1 = new int[10];
        int[] number2 = new int[10];
        boolean[] visited = new boolean[10];
        for(int i = 0; i < X.length(); i++){
            number1[X.charAt(i)-'0']++;
        }
        
        for(int i = 0; i < Y.length(); i++){
            number2[Y.charAt(i)-'0']++;
        }
        
        for(int i = 9; i >= 0; i--){
            if(number1[i] > 0 && number2[i] > 0){
                visited[i] = true;
                if(number1[i] < number2[i]){
                    for(int j = 0; j < number1[i]; j++){
                        answer.append(i);
                    }
                } else{
                    for(int j = 0; j < number2[i]; j++){
                        answer.append(i);
                    }
                }
            }
        }
        
        if(answer.length() == 0) answer.append("-1");
        if(visited[0]){
            for(int i = 1; i < 10; i++){
                if(visited[i])  break;
                answer = new StringBuilder();
                answer.append("0");
            }
        }
        return answer.toString();
    }
}