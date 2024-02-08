import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] farm;
    static boolean[][] check;
    static Queue<Integer> mqueue = new LinkedList<>();
    static Queue<Integer> nqueue = new LinkedList<>();
    static int count;

    static int M,N,K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int repeat = Integer.parseInt(st.nextToken());

        for (int c=0; c<repeat; c++){
            count = 0;
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            farm = new int[M][N];
            check = new boolean[M][N];

            for(int i=0; i<K; i++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                farm[a][b] = 1;
            }

            for(int i=0; i<M; i++){
                for(int j=0; j<N; j++){
                    if(farm[i][j] == 1 && !check[i][j]){
                        find(i,j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    public static void find(int a, int b){
        mqueue.add(a);
        nqueue.add(b);
        check[a][b] = true;

        while (!mqueue.isEmpty()){
            int x = mqueue.poll();
            int y = nqueue.poll();

            move(x - 1, y);
            move(x + 1, y);
            move(x, y - 1);
            move(x, y + 1);
        }
    }

    public static void move(int a, int b){
        if (a >= 0 && a < M && b >= 0 && b < N && farm[a][b] == 1 && !check[a][b]) {
            mqueue.add(a);
            nqueue.add(b);
            check[a][b] = true;
        }
    }
}
