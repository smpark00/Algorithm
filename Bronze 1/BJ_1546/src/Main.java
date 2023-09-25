import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double average;
        int count;
        long add = 0;
        long max = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        int[] score = new int[count];

        for (int i = 0; i < count; i++) {
            score[i] = sc.nextInt();
            add = add + score[i];
            if (max < score[i]) {
                max = score[i];
            }
        }
        average = (double) add / count / max * 100;
        System.out.printf("%.2f", average);
    }
}