import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main   {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int [] line = new int[M*2];

        for(int i=0; i<M; i++){
            String stri = br.readLine();

            StringTokenizer s = new StringTokenizer(stri);
            line[2*i] = Integer.parseInt(s.nextToken());
            line[2*i+1] = Integer.parseInt(s.nextToken());
        }
    }
}
