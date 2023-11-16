import java.util.Arrays;
import java.util.Scanner;

class charduplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        String overwrite_String = sc.next();
        int s = sc.nextInt();
        int a = Integer.parseInt(solution(my_string, overwrite_String, s));
    }
    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        char [] my = my_string.toCharArray();
        char [] overwrite = overwrite_string.toCharArray();

        for(int i = 0; i< overwrite.length; i++){
            my[i+s] = overwrite[i];
        }
        answer = String.valueOf(my);
        return answer;
    }
}