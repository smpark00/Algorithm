import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[1] = 0; // dp[1]은 이미 0으로 초기화되어야 합니다.

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1; // 현재 수에서 1을 빼는 경우

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1); // 현재 수를 2로 나누는 경우
            }

            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1); // 현재 수를 3으로 나누는 경우
            }
        }

        System.out.print(dp[n]);
    }
}
