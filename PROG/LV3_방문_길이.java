import java.util.*;
class Solution {
    
    public int solution(String dirs) {
        int answer = 0;
        int nx = 5, ny = 5;
        boolean[][][] visited = new boolean[11][11][4]; //현재 점에서 udrl중 어디가 다녀왔던 길인지 저장
        //UDRL
        //도착지->현재길, 현재길->도착길에 방문 여부 표시
        int dirLength = dirs.length();
        for(int i = 0; i < dirLength; i++){
            char now = dirs.charAt(i);
            if(now == 'U'){
                if(isNormal(nx-1, ny)){
                    visited[nx][ny][0] = true;
                    nx = nx-1;
                    visited[nx][ny][1] = true;
                }
            }
            if(now == 'D'){
                if(isNormal(nx+1, ny)){
                    visited[nx][ny][1] = true;
                    nx = nx+1;
                    visited[nx][ny][0] = true;
                }
            }
            if(now == 'R'){
                if(isNormal(nx, ny+1)){
                    visited[nx][ny][2] = true;
                    ny = ny+1;
                    visited[nx][ny][3] = true;
                }
            }
            if(now == 'L'){
                if(isNormal(nx, ny-1)){
                    visited[nx][ny][3] = true;
                    ny = ny-1;
                    visited[nx][ny][2] = true;
                }
            }
        }
        
        for(int i = 0; i < 11; i++){
            for(int j = 0; j < 11; j++){
                for(int k = 0; k < 4; k++){
                    if(visited[i][j][k]) answer++;
                }
            }
        }
        
        answer = answer/2;
        
        return answer;
    }
    
    public boolean isNormal(int a, int b){
        if(a < 0 || a >= 11 || b < 0 || b >= 11) return false;
        return true;
    }
}