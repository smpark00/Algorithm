import java.util.Arrays;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        int count = 0;
        for(int i=0; i< strArr.length; i++){
            if(!strArr[i].contains("ad")){
                answer[count] = strArr[i];
                count++;
            }
        }
        return Arrays.copyOf(answer,count);
    }
}