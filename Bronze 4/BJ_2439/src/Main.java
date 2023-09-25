import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count;
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();

        for (int i = 1; i < count + 1; i++) {
            for (int j = 0; j < count - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}