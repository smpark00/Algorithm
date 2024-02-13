import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int [][] dp;
    static int [][] expense;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        expense = new int[N][3];
        dp = new int[N][3];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            expense[i][0] = Integer.parseInt(st.nextToken());
            expense[i][1] = Integer.parseInt(st.nextToken());
            expense[i][2] = Integer.parseInt(st.nextToken());
        }
        dp[0][0] = expense[0][0];
        dp[0][1] = expense[0][1];
        dp[0][2] = expense[0][2];

        int a = Math.min(find(N-1, 0), Math.min(find(N-1, 1), find(N-1,2)));
        System.out.print(a);
    }

    private static int find(int num, int color) {
        if (num == 0) {
            return expense[0][color];
        }

        if(dp[num][color] == 0){
            if(color == 0){
                dp[num][color] = Math.min(find(num-1, 1), find(num-1, 2)) + expense[num][color];
            } else if (color == 1) {
                dp[num][color] = Math.min(find(num-1, 0), find(num-1, 2)) + expense[num][color];
            } else if (color == 2) {
                dp[num][color] = Math.min(find(num-1, 0), find(num-1, 1)) + expense[num][color];
            }
        }

        return dp[num][color];
    }
}
