import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] tomato;
    static int M, N, answer;
    static Queue<Integer> xlist, ylist;
    static boolean[][] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        tomato = new int[N][M];
        check = new boolean[N][M];

        xlist = new LinkedList<>();
        ylist = new LinkedList<>();

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                tomato[i][j] = Integer.parseInt(st.nextToken());
                if(tomato[i][j] == 1){
                    ylist.add(i);
                    xlist.add(j);
                    check[i][j] = true;
                }
            }
        }
        answer = -1;
        bfs();

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(tomato[i][j] == 0){
                    answer = -1;
                    break;
                }
            }
        }

        System.out.print(answer);
    }

    private static void bfs() {
        while (!ylist.isEmpty()){
            int size = ylist.size();
            for(int k=0; k<size; k++){
                int y = ylist.poll();
                int x = xlist.poll();
                tomato[y][x] = 1;

                checkit(y,x);
            }
            answer++;
        }
    }

    private static void checkit(int y, int x) {
        int [] array = {-1,1};

        for (int j : array) {
            if (y + j >= 0 && y + j < N && tomato[y + j][x] == 0 && !check[y + j][x]) {
                ylist.add(y + j);
                xlist.add(x);
                check[y + j][x] = true;
            }
            if (x + j >= 0 && x + j < M && tomato[y][x + j] == 0 && !check[y][x + j]) {
                ylist.add(y);
                xlist.add(x + j);
                check[y][x + j] = true;
            }
        }
    }
}
