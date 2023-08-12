class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] yoil = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int count = 0;
        
        //월 더하기
        for(int i = 0; i < a-1; i++)  count = count + days[i];
        count = count + b-1;
        
        answer = yoil[count%7];
        
                
        
        return answer;
    }
}