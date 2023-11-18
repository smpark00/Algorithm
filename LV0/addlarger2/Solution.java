import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int str1 = sc.nextInt();
        int str2 = sc.nextInt();
        int answer = solution(str1, str2);
        System.out.printf(String.valueOf(answer));
    }

    private static int solution(int a, int b) {
        int answer = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int answer2 = 2*a*b;
        if(answer >= answer2){
            return answer;
        }else{
            return answer2;
        }
    }
}
