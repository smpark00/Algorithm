import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] array, dp;
    static int answer, n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        array = new int[n][n];
        dp = new int[n][n];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<i+1; j++){
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = array[0][0]; // Base Case들 먼저 채우기
        for(int i=1; i<n; i++) {
            dp[i][0] = dp[i-1][0] + array[i][0]; // 맨왼쪽줄
        }

        find(1); // 값이 없는 맨 위 값
        System.out.print(answer);
    }

    private static void find(int depth) {
        if(depth == n){
            int max = 0;
            for(int i=0; i<n; i++){
               if(max < dp[n-1][i]){
                   max = dp[n-1][i];
               }
            }
            answer = max;
            return;
        }

        for(int i=1; i<=depth; i++){
            dp[depth][i] = Math.max(dp[depth-1][i], dp[depth-1][i-1]) + array[depth][i];
        }
        find(depth+1);
    }
}
