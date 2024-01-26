import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int first = 0;
        int totalSum = 0;

        while (a != totalSum) {
            if (b > 100) {
                first = -1;
                break;
            }

            first = a / b - (b - 1) / 2;

            if (first < 0) {
                first = -1;
                break;
            }

            totalSum = 0;
            for (int i = first; i < first + b; i++) {
                totalSum += i;
            }

            if (totalSum == a) {
                break;
            }

            b++;
        }

        if (first < 0) {
            System.out.print(-1);
        } else {
            for (int i = first; i < first + b; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
