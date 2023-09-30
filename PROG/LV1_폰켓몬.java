class Solution {
    public int solution(int[] nums) {
        int[] pocket = new int[200001];
        int answer = 0;
        
        for(int i = 0; i < nums.length; i++){
            pocket[nums[i]]++;
        }
        
        for(int i = 1; i <= 200000; i++){
            if(pocket[i] >= 1)  answer++;
        }
        
        if(answer > nums.length/2)  answer = nums.length/2;
        
        return answer;
    }
}