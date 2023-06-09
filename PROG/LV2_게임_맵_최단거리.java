import java.util.*;
class Solution {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int[][] visited;
    static class Point{
        int x, y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    public int solution(int[][] maps) {
        int answer = 0;
        
        int n = maps.length;
        int m = maps[0].length;
        bfs(maps, n, m);
        
        if(visited[n-1][m-1] == 0) answer = -1;
        else answer = visited[n-1][m-1]+1;
        
        return answer;
    }
    
    public void bfs(int[][] maps, int n, int m){
        Queue<Point> queue = new ArrayDeque<Point>();
        queue.offer(new Point(0, 0));
        
        visited = new int[n][m];
        
        while(!queue.isEmpty()){
            Point p = queue.poll();

            
            for(int i = 0; i < 4; i++){
                int tx = p.x + dx[i];
                int ty = p.y + dy[i];
                
                if(tx < 0 || tx >= n || ty < 0 || ty >= m || visited[tx][ty] != 0 || maps[tx][ty] == 0){
                    continue;
                }
                
                queue.offer(new Point(tx, ty));
                visited[tx][ty] = visited[p.x][p.y]+1;
            }
        }
        
        return;
    }
}