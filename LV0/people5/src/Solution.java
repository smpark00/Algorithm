import java.util.Arrays;
class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[10];
        int count=0;
        for(int i=0; i< names.length; i++){
            if(i%5 == 0){
                answer[count++] = names[i];
            }
        }
        return Arrays.copyOf(answer,count);
    }
}