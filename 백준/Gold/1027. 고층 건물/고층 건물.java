import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] check;
    static int[] buildings;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        buildings = new int[N];
        check = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            buildings[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<N-1; i++){
            for(int j=i+1; j<N; j++){
                calculate(i,j);
            }
        }

        int max = 0;
        for(int i=0; i< check.length; i++){
            if(check[i] > max){
                max = check[i];
            }
        }

        System.out.print(max);
    }

    private static void calculate(int a, int b) {
        double growth = (double) (buildings[b] - buildings[a]) /(b-a);
        boolean cal = true;

        for(int i = 1; i<b-a; i++){
            double result = buildings[a] + growth*i;

            if(result <= buildings[a+i]){
                cal = false;
                break;
            }
        }

        if(cal){
            check[a]++;
            check[b]++;
        }
    }
}
