import java.util.ArrayList;

class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        ArrayList<Integer> check = new ArrayList<>();
        for(int i=1; i<=n; i++){
            check.add(i);
        }
        
        k--;
        int answerindex = 0;
        
        while(n > 0){
            long count = 1;
            for(int i=1; i<=n-1; i++){
                count *= i;
            }
            int index = (int)(k/count);
            answer[answerindex++] = check.remove(index);
            k %= count;
            n--;
        }
        
        return answer;
    }
}