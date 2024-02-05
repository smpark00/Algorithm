import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = n/5;

        while (count>=0){
            int rest = n - (count * 5);
            if(rest %3 == 0){
                count += rest/3;
                break;
            } else {
                count--;
            }
        }
        if(count == 0){
            System.out.print(-1);
        }else {
            System.out.print(count);
        }
    }
}
