class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = new String();
        while(n > 0){
            int a = n%3;
            s = s + a;    
            n = n/3;
        }
        String rev = new String();
        for(int i = s.length()-1; i >= 0; i--){
            rev = rev + s.charAt(i);
        }
        
        int three = 1;
        
        for(int i = 0; i < s.length(); i++){
            answer = answer + (rev.charAt(i)-'0')*three;
            
            three = three * 3;
        }
        return answer;
    }
}