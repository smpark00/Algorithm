import java.util.LinkedList;
import java.util.Queue;

class Solution {
    Queue<Integer> queue = new LinkedList<>();

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int truckindex=0;
        int [] timeRecord = new int[truck_weights.length];

        while (true){
            time++;

            for (int j : timeRecord) {
                if (time == j) {
                    int a = queue.poll();
                    weight += a;
                }
            }

            if(truckindex < truck_weights.length && truck_weights[truckindex] <= weight){
                queue.add(truck_weights[truckindex]);
                timeRecord[truckindex] = time+bridge_length;
                weight -= truck_weights[truckindex];
                truckindex++;
            }
            if(queue.isEmpty()){
                break;
            }
        }
        return time;
    }
}