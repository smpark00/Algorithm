import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        if(my_string.charAt(0) == 'x'){
            my_string = my_string.substring(1);
        }
        my_string = my_string.replaceAll("x+", "x");
        String[] answer = my_string.split("x");
        Arrays.sort(answer);
        return answer;
    }
}
