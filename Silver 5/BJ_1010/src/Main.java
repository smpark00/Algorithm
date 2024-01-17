import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for(int i=0; i<size; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            long total = combination(a,b);
            System.out.println(String.valueOf(total));
        }
    }

    private static long combination(int n, int r) {
        long result = 1;

        if (r > n - r) {
            r = n - r;
        }

        for (int i = 0; i < r; i++) {
            result *= (n - i);
            result /= (i + 1);
        }

        return result;
    }
}