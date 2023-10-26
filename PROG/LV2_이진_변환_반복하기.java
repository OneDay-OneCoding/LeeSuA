class Solution {
    public int[] solution(String s) {
        int cnt = 0;
        int zero = 0;
        while(!s.equals("1")){
            cnt++;
            int tmp = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '0')  tmp++;
            }
            zero = zero + tmp;
            int now = s.length() - tmp;
            s = "";
            while(now != 0){                
                s = now%2 + s;
                now = now/2;
            }
        }
        
        int[] answer = {cnt, zero};
        return answer;
    }
}