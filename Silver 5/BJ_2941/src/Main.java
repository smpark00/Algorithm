import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        char first = 0;
        int count = 0;

        for(int i=0; i<a; i++){
            String str = sc.next();
            if(i == 0){
                first = str.charAt(0);
            }
            if(i%2 == 0){
                for(int j=1; j<=b/2; j++){
                    if(first != str.charAt(2*j-2)){
                        count++;
                    }else if(first == str.charAt(2*j-1)){
                        count++;
                    }
                }
            }else {
                for(int j=1; j<=b/2; j++){
                    if(first == str.charAt(2*j-2)){
                        count++;
                    }else if(first != str.charAt(2*j-1)){
                        count++;
                    }
                }
            }
        }
        System.out.print(count);

    }
}