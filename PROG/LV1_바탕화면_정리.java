class Solution {
    public int[] solution(String[] wallpaper) {
        int lux = wallpaper.length+1, luy = wallpaper[0].length()+1, rdx = 0, rdy = 0;
        for(int i = 0; i < wallpaper.length; i++){
            for(int j = 0; j < wallpaper[0].length(); j++){
                if(wallpaper[i].charAt(j) == '#'){
                    if(lux > i) lux = i;
                    if(luy > j) luy = j;
                    if(rdx < i) rdx = i;
                    if(rdy < j) rdy = j; 
                }
            }
        }
        
        int[] answer = {lux, luy, rdx+1, rdy+1};
        
        return answer;
    }
}