import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println(0);
            return;
        }

        int[] number = new int[(int) (Math.log10(num) + 1)];
        for (int i = number.length - 1; i >= 0; i--) {
            number[i] = num % 10;
            num /= 10;
        }

        Arrays.sort(number);

        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i]);
        }
    }
}
