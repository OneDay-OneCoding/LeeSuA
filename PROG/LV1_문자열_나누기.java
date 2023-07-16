class Solution {
    public int solution(String s) {
        int answer = 0;
        int[] num = new int[27];
        
        char x = s.charAt(0);
        int first = 1;
        int other = 0;
        
        for(int i = 1, size = s.length(); i < size; i++){
            if(x != s.charAt(i))    other++;
            else first++;
            
            if(first == other){
                answer++;
                if(i+1 < size)  {
                    first = 1;
                    other = 0;
                    x = s.charAt(i+1);
                    i = i+1;
                }
                continue;
            }    
        }
        
        if(first != other)  answer++;
        return answer;
    }
}