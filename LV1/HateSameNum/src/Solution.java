import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = new int[arr.length];
        answer[0] = arr[0];
        int index =0;
        for(int i=0; i< arr.length; i++){
            if(answer[index] != arr[i]){
                index++;
                answer[index] = arr[i];
            }
        }

        return Arrays.copyOf(answer, index+1);
    }
}