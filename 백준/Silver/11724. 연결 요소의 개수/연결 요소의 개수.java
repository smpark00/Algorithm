import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean [] count;
    static int [][] array;
    static int N,M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        array = new int [N+1][N+1];
        count = new boolean[N+1];

        for(int i=0; i<M; i++){
            StringTokenizer s = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(s.nextToken());
            int b = Integer.parseInt(s.nextToken());

            array[a][b] = array[b][a] = 1;
        }

        int answer = 0;
        for(int i=1; i<=N; i++){
            if(!count[i]){
                bfs(i);
                answer++;
            }
        }
        System.out.print(answer);
    }
    public static void bfs(int i){
        count[i] = true;
        for(int j=1; j<=N; j++){
            if(array[i][j] == 1 && !count[j]){
                bfs(j);
            }
        }
    }
}
