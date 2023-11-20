import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String control = sc.next();
        System.out.printf(String.valueOf(solution(n,control)));
    }
    public static int solution(int n, String control) {
        int answer = n;
        char [] list = new char[control.length()];
        for(int i=0; i<control.length(); i++){
            list[i] = control.charAt(i);
            if(list[i] == 'w'){
                answer++;
            }else if(list[i] == 's'){
                answer--;
            } else if (list[i] == 'd') {
                answer += 10;
            } else if (list[i] == 'a') {
                answer -= 10;
            }
        }
        return answer;
    }
}
