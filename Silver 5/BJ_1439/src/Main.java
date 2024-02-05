import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char [] ch = str.toCharArray();

        int count = 0;

        for(int i=0; i< ch.length-1; i++){
            if(ch[i] != ch[i+1]){
                count++;
            }
        }
        if(count < 2){
            System.out.print(count);
        }else if(count%2 == 1){
            System.out.print(count/2+1);
        }else {
            System.out.print(count/2);
        }
    }
}
