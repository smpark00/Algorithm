import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] dp = new int[n+1][3];

        dp[1][0] = 1;  // 아무칸에도 사자를 두지 않는 경우
        dp[1][1] = 1;  // 왼쪽칸에 사자를 두는 경우
        dp[1][2] = 1;  // 오른쪽칸에 사자를 두는 경우

        for (int i = 2; i < n + 1; i++) {
            // i번째에 사자를 아무칸에도 두지 않는 경우
            // = i-1번째 사자를 두지 않음 + i-1번째 왼쪽칸에 사자를 둠 + i-1번째 오른쪽 칸에 사자를 둠
            dp[i][0] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % 9901;

            // i번째에 사자를 왼쪽칸에도 두는 경우
            // = i-1 칸에 사자를 두지 않음 + i-1 오른쪽 칸에 사자를 둠
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % 9901;

            // i번째에 사자를 오른쪽칸에도 두는 경우
            // = i-1 칸에 사자를 두지 않음 + i-1 왼쪽 칸에 사자를 둠
            dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % 9901;
        }

        System.out.println((dp[n][0] + dp[n][1] + dp[n][2]) % 9901);
    }
}