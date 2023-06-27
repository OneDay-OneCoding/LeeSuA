class Solution {
    static int size = 0, answer = 0;
    static int[] selected = new int[3];
    public int solution(int[] number) {
        size = number.length;
        comb(0, 0, number);
        return answer;
    }
    
    public void comb(int start, int cnt, int[] number){
        if(cnt == 3){
            int sum = selected[0] + selected[1] + selected[2];
            if(sum == 0) answer++;
            return;
        }
        for(int i = start; i < size; i++){
            selected[cnt] = number[i];
            comb(i+1, cnt+1, number);
        }
    }
}