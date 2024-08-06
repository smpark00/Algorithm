class Solution {
    private static int[][] snail;
    private int num = 0;
    
    public int[] solution(int n) {
        int size = (n * (n + 1)) / 2;
        int[] answer = new int[size];
        snail = new int[n][n];
        
        int x = -1, y = 0;
        int number = 1;
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i % 3 == 0) { 
                    x++;
                } else if (i % 3 == 1) { 
                    y++;
                } else if (i % 3 == 2) { 
                    x--;
                    y--;
                }
                snail[x][y] = number++;
            }
        }
        
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                answer[index++] = snail[i][j];
            }
        }
        return answer;
    }
}
