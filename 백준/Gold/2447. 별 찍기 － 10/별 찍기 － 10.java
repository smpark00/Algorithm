import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static char[][] star;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        star = new char[N][N];

        pattern(0, 0, N, false);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(star[i][j]);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    private static void pattern(int y, int x, int size, boolean blank) {
        if(blank){
            for(int i=y; i<y+size; i++){
                for(int j=x; j<x+size; j++){
                    star[i][j] = ' ';
                }
            }
            return;
        }

        if(size == 1){
            star[y][x] = '*';
            return;
        }

        int newsize = size/3;
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i==1 && j==1){
                    pattern(y+newsize*i, x+newsize*j, newsize, true);
                }else{
                    pattern(y+newsize*i, x+newsize*j, newsize, false);
                }
            }
        }
    }
}
