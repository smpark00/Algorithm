import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        if (nextPermutation(array)) {
            StringBuilder sb = new StringBuilder();
            for (int num : array) {
                sb.append(num).append(" ");
            }
            System.out.println(sb.toString().trim());
        } else {
            System.out.println(-1);
        }
    }

    private static boolean nextPermutation(int[] array) {
        int i = array.length - 1;

        while (i > 0 && array[i - 1] >= array[i]) {
            i--;
        }

        if (i <= 0) {
            return false; 
        }

        int j = array.length - 1;

        while (array[j] <= array[i - 1]) {
            j--;
        }

        swap(array, i - 1, j);

        j = array.length - 1;
        while (i < j) {
            swap(array, i, j);
            i++;
            j--;
        }

        return true;
    }

    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
