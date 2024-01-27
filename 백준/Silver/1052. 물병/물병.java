import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count;
        if (N <= K) { // 처음 들어온 N과 K값을 비교했을 때 K가 N보다 크다면 N개의 물병은 무조건 K개로 나눌 수 있다.
            System.out.println(0); // 위의 조건이 성립하면 구매할 물병이 없음
            return;
        }
        int buy = 0;
        while (true) {
            count = 0;
            int num = N;
            while (num != 0) {
                if (num % 2 == 1) { // 2진수로 나타낼 때 나머지가 나올 때 마다 count값을 1씩 늘려준다.
                    count += 1;
                }
                num /= 2;
            }
            if (count <= K){ // 2진수로 나타냈을 때의 1의 개수가 K보다 작거나 같으면 while문을 종료하고 buy로 구매할 물병의 개수를 출력한다.
                break;
            } //count가 K보다 크다면 이는 N개를 K개로 만들 수 없다는 것이므로 N과 buy(구매할 물병의 개수)를 증가시켜 다시 while문을 돌게한다.
            N += 1;  
            buy += 1;

        }
        System.out.println(buy);

    }
}