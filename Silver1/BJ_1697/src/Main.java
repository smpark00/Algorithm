import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;

        if (N == K) {
            System.out.print(0);
        } else if (N > K) {
            count = N - K;
            System.out.print(count);
        } else {
            if(N==0){
                N++;
                count++;
            }
            count += findcount(N, K, 0);
            System.out.print(count);
        }
    }

    private static int findcount(int n, int k, int count) {
        if(n == k){
            return count;
        }
        if(2*n <= k){
            n *= 2;
            count++;
            count = findcount(n,k,count);
        } else if ((n + n / 2) <= k) {
            count = Math.min(findcount(n-1,k,count+1),findcount((n-1)*2, k, count+2));
        } else {
            count += Math.abs(n-k);
        }
        return count;
    }
}
