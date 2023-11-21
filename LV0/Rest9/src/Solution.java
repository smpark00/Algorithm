import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        System.out.println(solution(number));
    }
    public static int solution(String number) {
        int answer = 0;
        char[] num = new char[number.length()];
        for(int i =0; i<number.length(); i++) {
            num[i] = number.charAt(i);
            answer += Integer.parseInt(String.valueOf(num[i]));
        }
        String a = String.valueOf(answer);
        return answer%9;
    }
}