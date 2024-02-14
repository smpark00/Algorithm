class Solution {
    static int[][] answer;
    static int number, x, y;

    public int[][] solution(int n) {
        answer = new int[n][n];
        number = 1;
        x = 0;
        y = 0;

        fillSpiral(n);
        
        return answer;
    }

    private void fillSpiral(int n) {
        int direction = 0; 

        while (number <= n * n) {
            answer[y][x] = number++;
            
            switch (direction) {
                case 0: // right
                    if (x + 1 < n && answer[y][x + 1] == 0) {
                        x++;
                    } else {
                        direction = 1;
                        y++;
                    }
                    break;
                case 1: // down
                    if (y + 1 < n && answer[y + 1][x] == 0) {
                        y++;
                    } else {
                        direction = 2;
                        x--;
                    }
                    break;
                case 2: // left
                    if (x - 1 >= 0 && answer[y][x - 1] == 0) {
                        x--;
                    } else {
                        direction = 3;
                        y--;
                    }
                    break;
                case 3: // up
                    if (y - 1 >= 0 && answer[y - 1][x] == 0) {
                        y--;
                    } else {
                        direction = 0;
                        x++;
                    }
                    break;
            }
        }
    }
}
