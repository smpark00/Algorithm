import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count, a = 0;
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            a = sc.nextInt();
            if(a == 0){
                System.out.printf("1 0");
            } else if (a == 1) {
                System.out.printf("0 1");
            }else {
                int[] result = fibo(a);
                System.out.printf("%d %d", result[1], result[0] + result[1]);
            }
            System.out.println();
        }
    }

    private static int[] fibo(int a) {
        int[] dp = new int[3];
        dp[0] = 1;
        dp[1] = 0;

        for (int j = 2; j <= a; j++) {
            int zero = dp[0];
            int one = dp[1];
            dp[0] = one;
            dp[1] = zero + one;
        }
        return dp;

    }

}