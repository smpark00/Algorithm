import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static Stack<String> stack;
    static int answer;
    static String str;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();

        stack = new Stack<>();
        answer = 0;

        for(int i=0; i<str.length(); i++){
            char a = str.charAt(i);
            calculate(a, i);
        }
        System.out.print(answer);
    }

    private static void calculate(char a, int index) {
        if(a == '('){
            stack.add("(");
            if(str.charAt(index+1) != ')'){
                answer++;
            }
        } else if (a == ')') {
            stack.pop();
            if(str.charAt(index-1) == '('){
                answer += stack.size();
            }
        }
    }
}
