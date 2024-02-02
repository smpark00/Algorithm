import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i=0; i< completion.length; i++){
            if(!Objects.equals(participant[i], completion[i])){
                answer = participant[i];
                break;
            }
        }
        if(answer.isEmpty()){
            answer = participant[participant.length-1];
        }
        
        return answer;
    }
}