import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();

        int count = recur(n, r, c);
        System.out.print(count);
    }

    private static int recur(int n, int r, int c) {
        if (n == 0) {
            return 0;
        }

        int size = (int) Math.pow(2, n - 1);
        int count = 0;

        if (r < size && c < size) { // 제 1사분면
            count += recur(n - 1, r, c);
        } else if (r < size && c >= size) { // 제 2사분면
            count += size * size;
            count += recur(n - 1, r, c - size);
        } else if (r >= size && c < size) { // 제 3사분면
            count += 2 * size * size;
            count += recur(n - 1, r - size, c);
        } else { // 제 4사분면
            count += 3 * size * size;
            count += recur(n - 1, r - size, c - size);
        }

        return count;
    }
}
