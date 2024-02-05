import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int [] countpeople = new int [N];
        int [] answer = new int[N];

        StringTokenizer st = new StringTokenizer(str);
        for(int i=0; i<N; i++){
            countpeople[i] = Integer.parseInt(st.nextToken());
        }


        for (int j=0; j< countpeople.length; j++){
            int index = -1;
            for(int i=0; i< answer.length; i++){
                if(answer[i] == 0){
                    index++;
                }
                if(index == countpeople[j]){
                    answer[i] = j+1;
                    break;
                }
            }
        }

        for (int j : answer) {
            System.out.print(j + " ");
        }
    }
}
