import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int [arr.length];
        int first = -1;
        int last = -2;
        int size = 0;
        int onlyone = 0;

        for(int i=0; i< arr.length; i++){
            if(arr[i] == 2 && first == -1){
                first = i;
                answer[0] = 2;
                size++;
            }else if(arr[i] == 2 && first != -1){
                last = i;
                for(int j=first+1; j<=last; j++){
                    answer[size] = arr[j];
                    size++;
                }
                first = last;
            }
        }
       if(first == -1){
            answer[0] = -1;
            size++;
        }
        return Arrays.copyOf(answer,size);
    }
}