import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList<Integer> card = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            card.add(i);
        }

        while (card.size() > 1) {
            pull(card);
            goback(card);
        }

        System.out.print(card.get(0));
    }

    private static void goback(LinkedList<Integer> card) {
        int front = card.removeFirst();
        card.addLast(front);
    }

    private static void pull(LinkedList<Integer> card) {
        card.removeFirst();
    }
}
