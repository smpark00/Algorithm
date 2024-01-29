import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String [] part = str.split("-");
        int total = calculate(part[0]);

        for(int i=1; i<part.length; i++){
            total -= calculate(part[i]);
        }
        System.out.print(total);
    }

    private static int calculate(String s) {
        String[] part = s.split("\\+"); // "+"는 정규 표현식에서 특별한 의미를 갖기 때문에 "\\"를 추가하여 이스케이프해야 한다.
        int total = 0;
        for (int i = 0; i < part.length; i++) {
            total += Integer.parseInt(part[i]); // 
        }
        return total;
    }

}
