import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count, change;
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        change = sc.nextInt();

        int[] basket = new int[count];
        for (int i = 0; i < count; i++) {
            basket[i] = i + 1;
        }

        int a, b, c;
        for (int j = 0; j < change; j++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = basket[a-1];
            basket[a-1] = basket[b-1];
            basket[b-1] = c;
        }

        for(int k=0; k<basket.length; k++){
            System.out.printf("%d ", basket[k]);
        }
    }
}