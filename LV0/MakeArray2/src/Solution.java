import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        System.out.printf(Arrays.toString(solution(l,r)));

    }
    public static int[] solution(int l, int r) {
        int[] answer = new int [10000];

        int count = 0;
        for(int i=l; i<= r; i++){
            int check = 0;
            char [] num = String.valueOf(i).toCharArray();
            for(int j=0; j< num.length; j++){
                if(num[j] == '5' || num[j] == '0'){
                    check++;
                }
                if(check == num.length){
                    answer[count] += i;
                    count++;
                }
            }
        }
        if(count == 0){
            return new int[]{-1};
        }
        return Arrays.copyOf(answer, count);
    }
}