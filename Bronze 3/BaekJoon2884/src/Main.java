import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hour, min;
        Scanner sc = new Scanner(System.in);
        hour = sc.nextInt();
        min = sc.nextInt();
        if(min>=45){
            min = min-45;
            System.out.printf(hour+" "+min);
        }else {
            min = 60-(45-min);
            if(hour == 0){
                hour = 23;
            }else{
                hour--;
            }
            System.out.printf(hour+" "+min);
        }

    }
}