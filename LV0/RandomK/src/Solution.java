import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int k) {
        ArrayList<Integer> answer = new ArrayList<>();
        arr = Arrays.stream(arr).sorted().toArray();
        int size = 0;

        for(int i: arr){
            if(!answer.contains(i) && answer.size() < k){
                answer.add(i);
                size++;
            }
        }

        while (size<k){
            answer.add(-1);
            size++;
        }

        return answer;
    }
}