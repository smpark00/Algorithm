import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        String answer = solution(code);
        System.out.printf(answer);
    }

    public static String solution(String code) {
        String answer = "";
        int mode = 0;
        char [] chars = code.toCharArray();
        for(int i = 0; i< chars.length; i++){
            if(chars[i] == '1' && mode == 0){
                mode = 1;
            } else if (chars[i] == '1' && mode == 1) {
                mode = 0;
            }
            if(mode == 0 && i%2 == 0 && chars[i] != '1'){
                answer += chars[i];
            }else if(mode == 1 && i%2 == 1 && chars[i] != '1') {
                answer += chars[i];
            }
        }
        if(answer.equals("")){
            answer = "EMPTY";
        }
        return answer;
    }
}