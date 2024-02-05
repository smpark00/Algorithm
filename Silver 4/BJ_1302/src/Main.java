import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> bookname = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            if (!bookname.contains(name)) {
                bookname.add(name);
                count.add(1);
            } else {
                int index = bookname.indexOf(name);
                count.set(index, count.get(index) + 1);
            }
        }

        int maxCount = 0;
        String result = "";

        for (int i = 0; i < count.size(); i++) {
            if (count.get(i) > maxCount || (count.get(i) == maxCount && bookname.get(i).compareTo(result) < 0)) {
                maxCount = count.get(i);
                result = bookname.get(i);
            }
        }

        System.out.println(result);
    }
}
