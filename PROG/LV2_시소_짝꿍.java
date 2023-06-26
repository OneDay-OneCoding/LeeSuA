class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        
        long[] weight = new long[1001];
        
        for(int i = 0; i < weights.length; i++){
            weight[weights[i]]++;
        }
        
        for(int i = 100; i < 1001; i++){
            if(weight[i] == 0) continue;
            //1. 1대 1
            answer = answer + (weight[i]*(weight[i]-1)/2);
            //2. 2대 1
            if(i*2 <= 1000) answer = answer + weight[i] * weight[i*2];
            //3. 3대 2
            if(i%2 == 0 && i/2*3 <= 1000) answer = answer + weight[i]*weight[i/2*3];
            //4. 4대 3
            if(i%3 == 0 && i/3*4 <= 1000) answer = answer + weight[i]*weight[i/3*4];
        }
        
        return answer;
    }
}