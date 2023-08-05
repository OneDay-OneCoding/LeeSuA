class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        for(int i = 0; i < arr.length; i++){
            answer = answer + arr[i];
        }
        
        answer = answer / (double)arr.length;
        return answer;
    }
}