class Solution {
    public String solution(String s) {
        
        String answer = "";
        boolean start = true;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ')  {//������ ���
                answer = answer + " ";
                start = true;
            }
            else{
                if(start){//������ ������ ���
                    if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                        answer = answer + (char)(s.charAt(i)-32);
                    else    answer = answer + s.charAt(i);
                    start = false;
                }
                else{
                    if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                        answer = answer + (char)(s.charAt(i)+32);
                    else    answer = answer + s.charAt(i);
                }
            }
        }
        
        return answer;
    }
}