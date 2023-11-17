import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String answer = solution(str1, str2);
        System.out.printf(answer);
    }

    public static String solution(String str1, String str2) {
        String answer = "";
        for(int i=0; i<str1.length(); i++){
            answer += str1.substring(i, i+1);
            answer += str2.substring(i, i+1);
        }
        if(str1.length() < str2.length()){
            answer += str2.substring(str1.length()+1);
        }

        return answer;
    }
}