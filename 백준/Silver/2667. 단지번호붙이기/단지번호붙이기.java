import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class Main {
    static int[][] house;
    static int answer;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        house = new int[N][N];

        ArrayList<Integer> result = new ArrayList<>();

        for(int j=0; j<N; j++) {
            String st = br.readLine();
            for (int i = 0; i < N; i++) {
                house[j][i] = Integer.parseInt(String.valueOf(st.charAt(i)));
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(house[i][j] == 1){
                    dfs(i,j);
                    result.add(answer);
                    answer = 0;
                }
            }
        }

        Integer[] resultArray = result.toArray(new Integer[0]);
        Arrays.sort(resultArray);

        System.out.println(resultArray.length);
        for (Integer integer : resultArray) {
            System.out.println(integer);
        }


    }

    private static void dfs(int x, int y) {
        answer++;
        house[x][y] = 0;

        for(int i=0;i<4;i++) {
            int nx = dx[i]+x;
            int ny = dy[i]+y;

            if(nx>=0 && ny>=0 && nx<N && ny<N && house[nx][ny] == 1) {
                dfs(nx,ny);
            }
        }
    }



}
