import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[8];

        for (int i = 0; i < 8; i++) {
            score[i] = sc.nextInt();
        }

        int[] arrayscore = Arrays.copyOf(score, score.length);
        Arrays.sort(arrayscore);
        int total = 0;
        int[] array = new int[5];

        for (int i = 3; i < 8; i++) {
            total += arrayscore[i];
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                if (arrayscore[i + 3] == score[j]) {
                    array[i] = j + 1;
                }
            }
        }

        Arrays.sort(array);
        System.out.println(total);
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i]);
            if (i != 4) {
                System.out.print(" ");
            }
        }
    }
}
