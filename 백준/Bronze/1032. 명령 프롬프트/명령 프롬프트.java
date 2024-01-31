import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] str = new String[n];

        for(int i=0; i<n; i++){
            str[i] = br.readLine();
        }

        StringBuilder answer = new StringBuilder();

        for(int i=0; i<str[0].length(); i++){
            boolean same = true;
            for(int j=0; j<str.length-1; j++){
                if(str[j].charAt(i) != str[j+1].charAt(i)){
                    same = false;
                }
            }
            if(same){
                answer.append(str[0].charAt(i));
            }else {
                answer.append('?');
            }
        }
        System.out.print(answer);
    }
}
