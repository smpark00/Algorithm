import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int [][] path = new int[n][3];
        for(int i=0; i<n; i++){
            path[i][0] = sc.nextInt();
            path[i][1] = sc.nextInt();
            path[i][2] = sc.nextInt();
            if(path[i][1] > d || (path[i][1] - path[i][0] < path[i][2])){
                for(int j=0; j<3; j++){
                    path[i][j] = 0;
                }
            }

        }
        for (int i=0; i< path.length; i++){
            System.out.print(path[i][0]);
            System.out.print(path[i][1]);
            System.out.println(path[i][2]);
        }
    }
}
