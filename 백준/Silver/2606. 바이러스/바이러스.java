import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

    private static boolean[][] map;
    private static boolean[] check;
    private static int answer = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int computer = Integer.parseInt(st.nextToken());
        map = new boolean[computer][computer];
        check = new boolean[computer];
        check[0] = true;

        st = new StringTokenizer(br.readLine());
        int connection = Integer.parseInt(st.nextToken());

        for(int i=0; i<connection; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a-1][b-1] = true;
            map[b-1][a-1] = true;
        }

        dfs(0, computer);
        System.out.print(answer);
    }

    private static void dfs(int index, int size) {
        if(!check[index]){
            answer++;
            check[index] = true;
        }
        for(int i=0; i<size; i++){
            if(map[index][i] && !check[i]){
                dfs(i, size);
            }
        }
    }
}