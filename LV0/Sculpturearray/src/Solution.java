import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {

        for(int i=0; i< query.length; i++){
            if(i %2 ==0){
                arr = Arrays.copyOf(arr, query[i]+1);
            } else {
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }

        return arr;
    }
}