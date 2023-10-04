class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        boolean[][] map1 = new boolean[n][n];
        boolean[][] map2 = new boolean[n][n];
        
        for(int i = 0; i < n; i++){
            int now = arr1[i];
            for(int j = 0; j < n; j++){
                if(now%2 == 1) map1[i][j] = true;
                now = now/2;
            }
        }
        
        for(int i = 0; i < n; i++){
            int now = arr2[i];
            for(int j = 0; j < n; j++){
                if(now%2 == 1) map2[i][j] = true;
                now = now/2;
            }
        }
        
        for(int i = 0; i < n; i++){
            String a = "";
            for(int j = n-1; j >= 0; j--){
                if(map1[i][j] || map2[i][j])   a = a + "#";
                else a = a + " ";
            }
            answer[i] = a;
        }
        
        
        return answer;
    }
}