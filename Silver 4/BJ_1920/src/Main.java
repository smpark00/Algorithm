import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a_num = sc.nextInt();
        int[] a_array = new int[a_num];
        for(int i=0; i<a_num; i++){
            a_array[i] = sc.nextInt();
        }
        int b_num = sc.nextInt();
        int[] b_array = new int[b_num];
        for(int i=0; i<b_num; i++){
            int x = sc.nextInt();
            b_array[i] = x_compare(x, a_array);
            System.out.println(b_array[i]);
        }


    }

    private static int x_compare(int x, int[] array) {
        for (int i=0; i<array.length; i++){
            if(x == array[i]){
                return 1;
            }
        }
        return 0;
    }
}