import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        Queue<Integer> q = new LinkedList<>();
        int priorsize = priorities.length;

        for (int priority : priorities) {
            q.add(priority);
        }
        Arrays.sort(priorities);

        while (!q.isEmpty()){
            int a = q.poll();
            location--;

            if(location == -1){
                if(a == priorities[priorsize-answer]){
                    break;
                }else{
                    q.add(a);
                    location = q.size()-1;
                }
            }

            if(a == priorities[priorsize-answer]){
                answer++;
            }else {
                q.add(a);
            }
        }

        return answer;
    }
}