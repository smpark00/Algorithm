import java.util.*;
import java.lang.Math;

class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for(int work: works){
            queue.offer(work);
        }
        
        for(int i=0; i<n; i++){
            int value = queue.poll();
            
            if(value == 0){
                return 0;
            }else{
                queue.add(value-1);
            }
        }
        
        long answer = 0;
        for(int i=0; i<works.length; i++){
            answer += Math.pow(queue.poll(), 2);
        }
        return answer;
    }
}