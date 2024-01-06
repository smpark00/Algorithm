import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = new int[10000];
        int size=0;
        for(int i=0; i<flag.length; i++){
            if(flag[i]){
                for(int j=0; j<2*arr[i]; j++){
                    answer[size] = arr[i];
                    size++;
                }
            }else {
                for(int t=0; t<arr[i]; t++){
                    size--;
                }
            }
        }
        return Arrays.copyOf(answer,size);
    }
}