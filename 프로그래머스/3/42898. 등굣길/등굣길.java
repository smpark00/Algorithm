class Solution {
    private int [][] map;
    
    public int solution(int m, int n, int[][] puddles) {
        map = new int[n+1][m+1];
        
        for(int i=0; i<puddles.length; i++){
            int a = puddles[i][0];
            int b = puddles[i][1];
            map[b][a] = -1;
        }
        map[1][1] = 1;
        
        int answer = findway(n,m);
        return answer;
    }
    
    public int findway(int y, int x){
        if(y<1 || x<1 || map[y][x] == -1){
            return 0;
        }
        
        if(map[y][x] > 0){
            return map[y][x];
        }
        
        map[y][x] = (findway(y-1, x) + findway(y, x-1)) % 1000000007;
        return map[y][x];
    }
}