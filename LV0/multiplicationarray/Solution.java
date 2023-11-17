import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        int k = sc.nextInt();
        String answer = solution(str1, k);
        System.out.printf(answer);
    }

    private static String solution(String str1, int k) {
        String answer = "";
        for(int i=0; i<k; i++){
            answer += str1;
        }
        return answer;
    }
}
