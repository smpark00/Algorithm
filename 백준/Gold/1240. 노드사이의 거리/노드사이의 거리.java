import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] distance;
    static boolean[] check;
    static int N, M, answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        distance = new int[N + 1][N + 1];
        check = new boolean[N + 1];
        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int dis = Integer.parseInt(st.nextToken());

            distance[a][b] = distance[b][a] = dis;
        }

        for (int i = 0; i < M; i++) {
            answer = 0;
            check = new boolean[N + 1];
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            dfs(a, b, 0);
            System.out.println(answer);
        }
    }

    private static void dfs(int start, int end, int dis) {
        check[start] = true;

        if (start == end) {
            answer = dis;
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (distance[start][i] > 0 && !check[i]) {
                dfs(i, end, dis + distance[start][i]);
            }
        }
    }
}
