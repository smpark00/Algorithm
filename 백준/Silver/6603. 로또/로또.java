import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int [] number, answer;
    static boolean[] check;
    static StringBuilder sb;
    static int k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
            if(k == 0){
                break;
            }
            number = new int[k];
            check = new boolean[k];
            answer = new int[6];
            for(int i=0; i<k; i++){
                number[i] = Integer.parseInt(st.nextToken());
            }
            recur(0,0);
            sb.append("\n");
            System.out.print(sb);
        }


    }

    public static void recur(int start, int depth) {
        if(depth == 6){
            for(int i=0; i<6; i++){
                sb.append(answer[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=start; i<k; i++){
            if(!check[i]){
                check[i] = true;
                answer[depth] = number[i];
                recur(i,depth+1);
                check[i] = false;
            }
        }

    }
}
