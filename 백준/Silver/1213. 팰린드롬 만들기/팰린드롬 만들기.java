import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        char[] str = st.toCharArray();

        int[] count = new int[26]; // 영문자 개수에 대한 배열

        for (char c : str) {
            count[c - 'A']++;
        }

        char[] answer = new char[str.length];
        int index = 0;
        int mid = str.length / 2;

        // 중앙에 올 수 있는 문자 체크
        char midChar = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 == 1) {
                if (midChar != 0) {
                    System.out.print("I'm Sorry Hansoo");
                    return;
                }
                midChar = (char) (i + 'A');
                count[i]--;
            }
        }

        // 문자 배치
        for (int i = 0; i < 26; i++) {
            while (count[i] > 0) {
                if (index >= mid) index = 0;
                answer[index] = (char) (i + 'A');
                answer[str.length - index - 1] = (char) (i + 'A');
                count[i] -= 2;
                index++;
            }
        }

        // 중앙에 올 수 있는 문자가 있다면 배치
        if (midChar != 0) {
            answer[mid] = midChar;
        }

        StringBuilder ans = new StringBuilder();
        for (char c : answer) {
            ans.append(c);
        }

        System.out.print(ans);
    }
}
