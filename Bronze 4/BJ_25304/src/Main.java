import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int totalcost, count, countcost = 0;
        Scanner sc = new Scanner(System.in);
        totalcost = sc.nextInt();
        count = sc.nextInt();

        int a, b;
        for (int i = 0; i < count; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            countcost = countcost + a * b;
        }
        if (totalcost == countcost) {
            System.out.printf("Yes");
        } else {
            System.out.printf("No");
        }

    }
}