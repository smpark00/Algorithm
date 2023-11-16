import java.util.Scanner;

public class findRemain1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = solution(n);
        System.out.printf(String.valueOf(answer));
    }

    public static int solution(int n) {
        int answer = 0;
        int number = n - 1;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }

}
