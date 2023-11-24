import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        int size = 0;

        for(int i=my_string.length()-1; i>=0; i--){
            String ans = String.valueOf(my_string.charAt(i));
            if(size == 0){
                answer[size] = ans;
            }else{
                answer[size] = ans + answer[size-1];
            }
            size++;
        }
        Arrays.sort(answer);
        return answer;
    }
}