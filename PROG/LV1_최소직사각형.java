class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int max = 0;
        int otherMax = 0;
        for(int i = 0; i < sizes.length; i++){
            if(max < sizes[i][0])   max = sizes[i][0];
            if(max < sizes[i][1])   max = sizes[i][1];
            
            int now = 0;
            if(sizes[i][1] > sizes[i][0])   now = sizes[i][0];
            else now = sizes[i][1];   
            
            if(otherMax < now) otherMax = now;
        }
        
        answer = max * otherMax;
        
        return answer;
    }
}