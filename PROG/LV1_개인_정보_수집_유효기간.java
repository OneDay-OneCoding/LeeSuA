import java.util.*;

class Solution {
    static int Y = 0, M = 0, D = 0;
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<Integer>();
        int[] term = new int[27];
        
        StringTokenizer st = new StringTokenizer(today, ".");
        Y = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());
        
        for(int i = 0; i < terms.length; i++){
            String[] now = terms[i].split(" ");
            term[now[0].charAt(0)-'A'] = Integer.parseInt(now[1]);
        }
        
        for(int i = 0; i < privacies.length; i++){
            String[] now = privacies[i].split(" ");
            st = new StringTokenizer(now[0], ".");
            
            int year = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int day = Integer.parseInt(st.nextToken());
            int t = term[now[1].charAt(0)-'A'];
            
            if(check(year, month, day, t))   list.add(i+1);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    public boolean check(int year, int month, int day, int term){
        month = month + term;
        day = day - 1;
        if(day < 1) {
            month = month - 1;
            day = 28;
        }
        if(month < 1){
            year = year - 1;
            month = 12;
        }
        if(month > 12){
            while(month > 12){
                year = year + 1;
                month = month - 12;
            }
        }

        if(year > Y) return false;
        if(year == Y && month > M) return false;
        if(year == Y && month == M && day >= D) return false;
        return true;
    }
}
