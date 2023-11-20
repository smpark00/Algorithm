import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num_list = new int[10];
        for(int i = 0; i<num_list.length; i++){
            num_list[i] = sc.nextInt();
        }
        int answer = solution(num_list);
        System.out.printf(String.valueOf(answer));
    }
    public static int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";
        for(int i = 0; i<num_list.length; i++){
            if(num_list[i] % 2 == 0){
                even += Integer.toString(num_list[i]);
            }else{
                odd += Integer.toString(num_list[i]);
            }
        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd);

        return answer;
    }
}
