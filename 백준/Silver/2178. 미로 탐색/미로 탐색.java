import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static char[][] map;
    static int[][] check; 

    static int N, M;

    static Queue<Integer> nq = new LinkedList<>();
    static Queue<Integer> mq = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new char[N+1][M+1];
        check = new int[N+1][M+1]; 

        for(int i=1; i<=N; i++){
            String s = br.readLine();
            for(int j=1; j<=M; j++){
                map[i][j] = s.charAt(j-1);
            }
        }

        int count = bfs(1, 1);
        System.out.print(count);
    }

    private static int bfs(int n, int m) {
        nq.add(n);
        mq.add(m);
        check[n][m] = 1;

        while (!nq.isEmpty()){
            int size = nq.size(); // 현재 레벨에 있는 노드의 개수를 저장
            for (int i = 0; i < size; i++) {
                int a = nq.poll();
                int b = mq.poll();

                if(a == N && b == M){
                    return check[a][b]; // 최종 목적지에 도달한 경우 해당 칸까지의 최소 이동 횟수를 반환
                }

                // 네 방향으로 이동
                move(a-1, b, a, b); // 위로 이동
                move(a+1, b, a, b); // 아래로 이동
                move(a, b-1, a, b); // 왼쪽으로 이동
                move(a, b+1, a, b); // 오른쪽으로 이동
            }
        }
        return -1; // 도달할 수 없는 경우
    }

    private static void move(int nextN, int nextM, int currentN, int currentM) {
        if (nextN >= 1 && nextN <= N && nextM >= 1 && nextM <= M && map[nextN][nextM] == '1' && check[nextN][nextM] == 0) {
            nq.add(nextN);
            mq.add(nextM);
            check[nextN][nextM] = check[currentN][currentM] + 1; // 현재 칸까지의 이동 횟수 + 1
        }
    }
}
