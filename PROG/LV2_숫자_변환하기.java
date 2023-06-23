import java.util.*;

class Solution {
    static int X, Y;
    public int solution(int x, int y, int n) {
        X = x;
        Y = y;

        int result = bfs(n);
        return result;
    }
    
    public int bfs(int n){
        Queue<Integer> queue = new ArrayDeque<Integer>();
        queue.offer(X);
        int cnt = 0;
        boolean flag = false;
        boolean[] visited = new boolean[1000001];
        Loop1:while(!queue.isEmpty()){
            for(int i = 0, size = queue.size(); i < size; i++){
                int now = queue.poll();
                if(now == Y){
                    flag = true;
                    break Loop1;
                }
                if(now+n <= Y && !visited[now+n]) {queue.offer(now+n);visited[now+n] = true;}
                if(now*2 <= Y && !visited[now*2]) {queue.offer(now*2);visited[now*2] = true;}
                if(now*3 <= Y && !visited[now*3]) {queue.offer(now*3);visited[now*3] = true;} 
            } 
            cnt++;
        } 
        if(flag) return cnt;
        else return -1;
    }
}