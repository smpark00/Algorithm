import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String firstLine = br.readLine();
        StringTokenizer st = new StringTokenizer(firstLine);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();

        String secondLine = br.readLine();
        StringTokenizer second = new StringTokenizer(secondLine);
        for (int i = 0; i < a; i++) {
            A.add(Integer.valueOf(second.nextToken()));
        }

        String thirdLine = br.readLine();
        StringTokenizer third = new StringTokenizer(thirdLine);
        for (int i = 0; i < b; i++) {
            B.add(Integer.valueOf(third.nextToken()));
        }

        HashSet<Integer> intersect = new HashSet<>(A);
        intersect.retainAll(B); // 교집합 구하기

        int difference = (A.size() + B.size()) - 2 * intersect.size();
        System.out.println(difference);
    }
}
