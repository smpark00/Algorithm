import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        int answer = solution(str1);
        System.out.printf(String.valueOf(answer));
    }

    private static int solution(String num_str) {
        int answer = 0;
        char [] num = new char[num_str.length()];
        for(int i=0; i<num_str.length(); i++){
            answer += num_str.charAt(i) - 48;
        }
        return answer;
    }
}
