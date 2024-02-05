import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int switchnum = sc.nextInt();

        ArrayList<Integer> switchh = new ArrayList<>();
        switchh.add(-1);

        for(int i=0; i<switchnum; i++){
            int n = sc.nextInt();
            switchh.add(n);
        }

        int student = sc.nextInt();
        for(int i=0; i<student; i++){
            int sex = sc.nextInt();
            int num = sc.nextInt();

            if(sex == 1){
                for(int j=num; j<switchh.size(); j=j+num){
                    switchh.set(j, 1-switchh.get(j));
                }
            } else if (sex == 2) {
                int start = num;
                int end = num;

                while (start > 1 && end < switchh.size() - 1 && switchh.get(start - 1).equals(switchh.get(end + 1))) {
                    start--;
                    end++;
                }

                for (int j = start; j <= end; j++) {
                    switchh.set(j, 1 - switchh.get(j));
                }
            }
        }
        for (int i = 1; i <= switchnum; i++) {
            System.out.print(switchh.get(i) + " ");
            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }
}
