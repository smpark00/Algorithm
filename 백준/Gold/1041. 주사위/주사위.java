import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] dice = new int[6];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            dice[i] = Integer.parseInt(st.nextToken());
        }

        if (N == 1) {
            Arrays.sort(dice);
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += dice[i];
            }
            System.out.print(sum);
        } else {
            int[] min = new int[3];
            min[0] = Math.min(dice[0], dice[5]);
            min[1] = Math.min(dice[1], dice[4]);
            min[2] = Math.min(dice[2], dice[3]);
            
            Arrays.sort(min);
            
            long answer = 0;

            long threeSideCount = 4L;
            long twoSideCount = 8L * (N - 2) + 4;
            long oneSideCount = 5L * (N - 2) * (N - 2) + 4L * (N - 2);

            answer += threeSideCount * (min[0] + min[1] + min[2]);
            answer += twoSideCount * (min[0] + min[1]);
            answer += oneSideCount * min[0];

            System.out.print(answer);
        }
    }
}
