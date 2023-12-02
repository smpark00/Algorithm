import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int [100];
        int size=0;
        for(int i=n-1; i< num_list.length; i++){
            answer[size] = num_list[i];
            size++;
        }
        return Arrays.copyOf(answer,size);
    }
}