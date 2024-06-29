import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int i = 0;
        Arrays.sort(d);
        
        while(d.length > answer && budget >= d[i]){
            budget -= d[i];
            answer++;
            i++;
        }
        return answer;
    }
}