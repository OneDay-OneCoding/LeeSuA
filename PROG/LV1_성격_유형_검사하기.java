class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] score = new int[27];
        for(int i = 0; i < survey.length; i++){
            int first = survey[i].charAt(0)-'A';
            int second = survey[i].charAt(1)-'A';
            
            if(choices[i] == 1){
                score[first] = score[first] + 3;
            }
            if(choices[i] == 2){
                score[first] = score[first] + 2;
            }
            if(choices[i] == 3){
                score[first] = score[first] + 1;
            }
            if(choices[i] == 5){
                score[second] = score[second] + 1;
            }
            if(choices[i] == 6){
                score[second] = score[second] + 2;
            }
            if(choices[i] == 7){
                score[second] = score[second] + 3;
            }
            
        }
        
        if(score['T'-'A'] > score['R'-'A']) answer = answer + "T";
        else answer = answer + "R";
        
        if(score['F'-'A'] > score['C'-'A']) answer = answer + "F";
        else answer = answer + "C";
        
        if(score['M'-'A'] > score['J'-'A']) answer = answer + "M";
        else answer = answer + "J";
        
        if(score['N'-'A'] > score['A'-'A']) answer = answer + "N";
        else answer = answer + "A";
        
        
        return answer;
    }
}