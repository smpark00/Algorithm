import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> stack = new ArrayList<>();
        StringBuilder output = new StringBuilder();

        for(int i = 0; i < n; i++){
            String str = sc.next();
            switch (str){
                case "push": {
                    int k = sc.nextInt();
                    stack.add(k);
                    break;
                }
                case "pop": {
                    if(stack.isEmpty()){
                        output.append("-1\n");
                    } else {
                        output.append(stack.remove(stack.size() - 1)).append("\n");
                    }
                    break;
                }
                case "size": {
                    output.append(stack.size()).append("\n");
                    break;
                }
                case "empty": {
                    output.append(stack.isEmpty() ? "1\n" : "0\n");
                    break;
                }
                case "top": {
                    if(stack.isEmpty()){
                        output.append("-1\n");
                    } else {
                        output.append(stack.get(stack.size() - 1)).append("\n");
                    }
                    break;
                }
            }
        }

        System.out.print(output);
    }
}
