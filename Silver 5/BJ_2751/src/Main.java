import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int size = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        for (Integer c : list){
            sb.append(c).append("\n");
        }

        System.out.println(sb);
    }
}