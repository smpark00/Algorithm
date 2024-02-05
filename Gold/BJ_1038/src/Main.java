import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N<10){
            System.out.print(N);
            return;
        }

        int count = 9;
        int number = 9;
        while (count != N){
            number++;
            if(number%10 < (number/10)%10){
                count++;
            }
        }
        System.out.print(number);
    }
}
