import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        int[][][] tomato = new int[H][N][M];
        Queue<int[]> queue = new LinkedList<>();
        int days = 0;
        int totalTomatoes = 0;
        int ripeTomatoes = 0;

        for(int k = 0; k < H; k++){
            for(int j = 0; j < N; j++){
                st = new StringTokenizer(br.readLine());
                for(int i = 0; i < M; i++){
                    tomato[k][j][i] = Integer.parseInt(st.nextToken());
                    if(tomato[k][j][i] == 1){
                        queue.add(new int[]{k, j, i});
                    }
                    if(tomato[k][j][i] != -1){
                        totalTomatoes++;
                    }
                }
            }
        }

        int[] dz = {1, -1, 0, 0, 0, 0};
        int[] dy = {0, 0, 1, -1, 0, 0};
        int[] dx = {0, 0, 0, 0, 1, -1};

        while(!queue.isEmpty()){
            int size = queue.size();
            ripeTomatoes += size;
            for(int s = 0; s < size; s++){
                int[] location = queue.poll();
                int z = location[0];
                int y = location[1];
                int x = location[2];

                for(int d = 0; d < 6; d++){
                    int nz = z + dz[d];
                    int ny = y + dy[d];
                    int nx = x + dx[d];

                    if(nz >= 0 && nz < H && ny >= 0 && ny < N && nx >= 0 && nx < M && tomato[nz][ny][nx] == 0){
                        tomato[nz][ny][nx] = 1;
                        queue.add(new int[]{nz, ny, nx});
                    }
                }
            }
            if(!queue.isEmpty()) days++;
        }

        if(ripeTomatoes == totalTomatoes){
            System.out.print(days);
        } else {
            System.out.print(-1);
        }
    }
}
