import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] weight = new int[N];
        int[] happiness = new int[N];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            happiness[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[K+1];

        for(int i=0; i<N; i++){
            for(int j=K; j>=weight[i]; j--){
                dp[j] = Math.max(dp[j], dp[j-weight[i]] + happiness[i]);
            }
        }

        System.out.print(dp[K]);
    }
}
