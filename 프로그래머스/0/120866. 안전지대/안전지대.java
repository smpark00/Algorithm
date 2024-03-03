class Solution {
    static int[] dx = {-1,0,1};
    static int[] dy = {-1,0,1};
    
    public int solution(int[][] board) {
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                find(i,j,board);
            }
        }
        
        int answer = 0;
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                if(board[i][j] == 0){
                    answer++;
                }
            }
        }
        return answer;
    }
    
    public void find(int i, int j, int[][] board){
        if(board[i][j] != 1){
            return;
        }
        for(int a=0; a<3; a++){
            for(int b=0; b<3; b++){
                int y = i + dy[a];
                int x = j + dx[b];
                
                if(y>=0 && y<board.length && x>=0 && x<board.length){
                    if(board[y][x] == 0){
                        board[y][x] = 2;
                    }
                }
            }
        }
    }
}