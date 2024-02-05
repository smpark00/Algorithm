import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.StreamTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int[] array = new int[n];
        int[] dp = new int[n];

        StreamTokenizer st = new StreamTokenizer(new StringReader(s));
        for (int i = 0; i < n; i++) {
            st.nextToken();
            array[i] = (int) st.nval;
        }

        dp[0] = array[0];
        int max = array[0];

        for(int i=1; i<n; i++){
            dp[i] = Math.max(dp[i-1] + array[i] , array[i]);
            max = Math.max(dp[i] , max);
        }

        System.out.print(max);
    }
}
