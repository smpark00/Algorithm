import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();

        while (true){
            if(E == S && S == M){
                break;
            }
            if(S>=E && M>=E){
                E += 15;
            } else if (E>=S && M>=S) {
                S += 28;
            } else if (S>=M && E>= M) {
                M += 19;
            }
        }
        System.out.print(E);
    }
}
