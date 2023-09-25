import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count;
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        int[] array = new int[count];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < count; i++) {
            array[i] = sc.nextInt();
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.printf("%d %d", min, max);
    }
}