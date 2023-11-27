import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = new int [arr.length*intervals.length];
        int index =0;
        for(int i=0; i< intervals.length; i++){
            int a = intervals[i][0];
            int b = intervals[i][1];
            for(int j=a; j<=b; j++){
                answer[index] = arr[j];
                index++;
            }
        }
        return Arrays.copyOf(answer,index);
    }
}