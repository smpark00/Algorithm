import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count=0;
        int repeat=0;
        int arrange=0;
        while(true){
            repeat++;
            count += repeat;
            if(count >= num){
                arrange = count-num; // 칸 차이를 구함
                break;
            }
        }

        if(repeat%2 == 1){ // num이 숫자면 왼쪽부터 시작
            int b = repeat-arrange;
            int a = repeat-b+1;
            System.out.print(a+"/"+b);
        }else {
            int a = repeat-arrange;
            int b = repeat-a+1;
            System.out.print(a+"/"+b);
        }
    }
}
