import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int stick=0;
        while (true){
            for(int i=6; i>=0; i--){
                if(Math.pow(2,i)<= length){
                    length -= (int) Math.pow(2,i);
                    stick++;
                    break;
                }
            }
            if(length == 0){
                break;
            }
        }
        System.out.println(stick);
    }
}