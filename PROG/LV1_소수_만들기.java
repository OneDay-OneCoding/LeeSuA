class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length-2; i++){
            for(int j = i+1; j < nums.length-1; j++){
                for(int k = j+1; k < nums.length; k++){
                    if(i == j || i == k || j == k)  continue;
                    if(isPrime(nums[i]+nums[j]+nums[k]))  answer++;
                }
            }
        }

        return answer;
    }
    
    public boolean isPrime(int number){
        for(int i = 2; i*i <= number; i++){
            if(number%i == 0)   return false;
        }
        return true;
    }
}