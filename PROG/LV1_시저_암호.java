class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char now = s.charAt(i);
            if(now == ' '){//����
                sb.append(" ");
            }
            
            else if(now < 'a'){//�빮��
                if(now+n > 'Z') sb.append((char)(now+n-26));
                else sb.append((char)(now+n));
            }
            else {//�ҹ���
                if(now+n > 'z') sb.append((char)(now+n-26));
                else sb.append((char)(now+n));
            }
        }
        
        
        String answer = sb.toString();
        return answer;
    }
}