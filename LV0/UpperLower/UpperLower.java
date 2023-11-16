import java.util.Arrays;
import java.util.Scanner;

public class UpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] text = a.toCharArray();
        for (int i = 0; i < text.length; i++) {
            if (text[i] <= 'Z') {
                text[i] = Character.toLowerCase(text[i]);
                System.out.printf(String.valueOf(text[i]));
            } else if (text[i] > 'Z') {
                text[i] = Character.toUpperCase(text[i]);
                System.out.printf(String.valueOf(text[i]));
            }
        }
    }
}