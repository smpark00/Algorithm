import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = num;
        for(int i=0; i<num; i++){
            String str = sc.next();
            int[] alphabet = new int[26]; // 알파벳 개수세기 a,b,c...[] 알파벳이 끝나고 더 이상 카운팅 불가가 될때 1로 변경하려함

            for(int j=0; j<str.length(); j++){
                if(alphabet[(int) str.charAt(j) - 'a'] != 0 ){ // 알파뱃 배열이 1이면(이전에 나왔다면) num을 줄이는 방향으로
                    answer--;
                    break;
                }else if(j<str.length()-1 && str.charAt(j) !=  str.charAt(j+1)){
                    alphabet[(int) str.charAt(j) - 'a']++;
                }
            }
        }
        System.out.print(answer);
    }
}
