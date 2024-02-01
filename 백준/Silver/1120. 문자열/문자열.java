import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);
        String A = st.nextToken();
        String B = st.nextToken();

        int diff = B.length()-A.length();
        //int [] find = new int[diff];
        int min=10000000;

        for(int i=0; i<= diff; i++){
            int count = 0;
            for(int j=0; j< A.length(); j++){
                if(A.charAt(j) != B.charAt(i+j)){
                    count++;
                }
            }
            //find[i] = count;
            if(count < min){
                min = count;
            }
        }

        if(min == 10000000){
            System.out.print(0);
        }else {
            System.out.print(min);
        }
    }
}
