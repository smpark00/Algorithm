import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for(int i: scoville){
            queue.add(i);
        }
        
        while (queue.peek()<K){
            if(queue.size() == 1){
                return -1;
            }
            answer++;

            int a = queue.poll()+queue.poll()*2;
            queue.add(a);
        }

        return answer;
    }
}