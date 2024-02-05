import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] coinsize = new int[n];
        int [][] coinnum = new int[n][n];
        int coinnumindex = 0;

        for(int i=0; i<n; i++){
            coinsize[i] = sc.nextInt();
        }
        Arrays.sort(coinsize); // 정렬

        while(true){

        }

    }
}
