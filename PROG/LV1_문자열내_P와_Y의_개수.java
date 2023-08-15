class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int p = 0, y = 0;
        
        for(int i = 0; i < s.length(); i++){
            char now = s.charAt(i);
            if(now == 'p' || now == 'P') p++;
            if(now == 'y' || now == 'Y') y++;
        }
        
        if(p == y)  answer = true;

        return answer;
    }
}