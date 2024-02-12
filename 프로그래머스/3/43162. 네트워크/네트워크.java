class Solution {
    static boolean[] check;

    public int solution(int n, int[][] computers) {
        int count = 0;
        check = new boolean[n+1];

        for(int i=1; i<=n; i++){
            if(!check[i]){
                dfs(i, n, computers);
                count++;
            }
        }
        return count;
    }

    private void dfs(int start, int n, int[][] computers) {
        check[start] = true;
        
        for(int i=0; i<n; i++){
            if(computers[start-1][i] == 1 && !check[i+1]){
                dfs(i+1, n, computers);
            }
        }
    }
}