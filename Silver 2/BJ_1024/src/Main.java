import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int first = 0;
        int total = 0;

        while (a != total){
            first = a/b-((b-1)/2);

            if(first<0){
                first = -1;
                break;
            }

            total=0;
            for(int i=first; i<first+b; i++){
                total += i;
            }
            if(total == a){
                break;
            }

            if(b == 100){
                first = -1;
                break;
            }
            b++;
        }
        if(first<0){
            System.out.print(-1);
        }else {
            for(int i=first; i<first+b; i++){
                System.out.print(i+" ");
            }
        }
    }
}
