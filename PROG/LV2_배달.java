class Solution {
    static final int INF = 500001;
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        int[][] map = new int[N][N];
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(i == j) continue;
                map[i][j] = INF;
            }
        }
        
        for(int i = 0; i < road.length; i++){
            int a = road[i][0]-1;
            int b = road[i][1]-1;
            int w = road[i][2];
            
            if(map[a][b] > w){
                map[a][b] = w;
                map[b][a] = w;
            }
        }
        

        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map.length; j++){
                for(int k = 0; k < map.length; k++){
                    if(map[j][k] > map[j][i] + map[i][k])
                        map[j][k] = map[j][i]+map[i][k];
                }
            }
        }
        
        for(int i = 0; i < map[0].length; i++){
            if(map[0][i] <= K) answer++;
        }
        return answer;
    }
}