import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] array = new int[k];
        int max = 0;

        for (int i = 0; i < k; i++) {
            array[i] = Integer.parseInt(br.readLine());
            if (max < array[i]) {
                max = array[i];
            }
        }

        long min = 1;  
        long maxLen = max;  
        long result = 0;

        while (min <= maxLen) {
            long mid = (min + maxLen) / 2;
            long count = 0;

            for (int i = 0; i < array.length; i++) {
                count += array[i] / mid;
            }

            if (count >= n) {
                result = mid;  
                min = mid + 1;
            } else {
                maxLen = mid - 1;
            }
        }

        System.out.print(result);
    }
}
