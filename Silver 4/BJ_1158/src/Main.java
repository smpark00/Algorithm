import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        LinkedList<Integer> circle = new LinkedList<>();
        for(int i=0; i<n; i++){
            circle.add(i+1);
        }

        int [] answer = new int [n];
        int answerindex = 0;
        int currentindex = 0;
        while(!circle.isEmpty()){
            currentindex = ((currentindex+k-1) % circle.size());
            answer[answerindex] = circle.remove(currentindex);
            answerindex++;
        }

        System.out.print("<");
        for (int i=0; i< answer.length; i++) {
            System.out.print(answer[i]);
            if(i < answer.length-1){
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }
}
