class Solution {
    public boolean solution(int x) {
        boolean answer = check(x);
        return answer;
    }
    
    boolean check(int x){
        int sum = 0;
        
        String a = Integer.toString(x);
        for(int i = 0; i < a.length(); i++){
            sum = sum + a.charAt(i)-'0';           
        }
        
        if(x%sum == 0)  return true;
        else return false;
    }
}