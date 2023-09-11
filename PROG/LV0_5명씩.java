class Solution {
    public String[] solution(String[] names) {
        int size = names.length;
        
        String[] answer = new String[size/5+1];
        if(size%5 == 0) answer = new String[size/5];
        
        for(int i = 0; i < size; i++){ 
            if(i%5 == 0)    answer[i/5] = names[i];
        }
        
        return answer;
    }
}
