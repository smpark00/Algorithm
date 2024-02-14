import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] prices) {
        int [] answer = new int[prices.length];
        Queue<Integer> queue = new LinkedList<>();

        for (int price : prices) {
            queue.add(price);
        }

        int number = 0;

        while(queue.peek() != null){
            int peek = queue.poll();

            answer[number] = 0;

            for(int integer : queue){
                answer[number]++;
                if(peek > integer){
                    break;
                }
            }
            
            number++;
        }

        return answer;
    }
}