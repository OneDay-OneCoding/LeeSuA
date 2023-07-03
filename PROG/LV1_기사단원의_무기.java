class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i = 1; i <= number; i++){
            int now = yak(i);
            if(now > limit) answer = answer + power;
            else answer = answer + now;
        }
        
        return answer;
    }
    
    public int yak(int num){
        int result = 1;
        for(int i = 1; i <= num/2; i++){
            if(num%i == 0) result++;
        }
        return result;
    }
}