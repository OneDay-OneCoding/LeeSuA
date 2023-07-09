import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int h = park.length;
        int w = park[0].length();
        
        int x = 0;
        int y = 0;
        
        char[][] map = new char[h][w];
        
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                char now = park[i].charAt(j);
                if(now == 'S'){
                    x = i;
                    y = j;
                }
                map[i][j] = now;
            }
        }
        
        
        
        Loop1:for(int i = 0; i < routes.length; i++){
            char d = routes[i].charAt(0);
            int n = routes[i].charAt(2)-'0';
            if(d == 'E'){
                if(y + n >= w) continue Loop1;
                for(int j = y; j <= y+n; j++){
                    if(map[x][j] == 'X') continue Loop1;
                }
                y = y + n;
            }
            
            if(d == 'W'){
                if(y - n < 0) continue Loop1;
                for(int j = y; j >= y-n; j--){
                    if(map[x][j] == 'X') continue Loop1;
                }
                y = y - n;
            }
            
            if(d == 'S'){
                if(x + n >= h) continue Loop1;
                for(int j = x; j <= x+n; j++){
                    if(map[j][y] == 'X') continue Loop1;
                }
                x = x + n;
            }
            
            if(d == 'N'){
                if(x - n < 0) continue Loop1;
                for(int j = x; j >= x-n; j--){
                    if(map[j][y] == 'X') continue Loop1;
                }
                x = x - n;
            }
            System.out.println(x + " " + y);
        }
        
        int[] answer = {x, y};
        return answer;
    }
}