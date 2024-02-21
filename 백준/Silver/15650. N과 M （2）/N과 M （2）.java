import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static boolean [] check;
    static int[] num;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        check = new boolean[N];
        num = new int[M];

        backtracking(0,0);
        System.out.print(sb);
    }

    private static void backtracking(int n, int length) {
        if(length == M){
            for (int j : num) {
                sb.append(j).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=n; i<N; i++){
            if(!check[i]) {
                check[i] = true;
                num[length] = i + 1;
                backtracking(i,length + 1);
            }
            check[i] = false;
        }
    }
}
