import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int [10000];
        int count = 0;
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[i]; j++){
                answer[count] = arr[i];
                count++;
            }
        }

        return Arrays.copyOf(answer, count);
    }
}