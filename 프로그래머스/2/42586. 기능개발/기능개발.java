import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> stack = new ArrayList<>();
        int index = 0;

        while (index < progresses.length) {
            for (int i = 0; i < progresses.length; i++) {
                progresses[i] += speeds[i];
            }
            
            if (progresses[index] >= 100) {
                int deployCount = 0;
                while (index < progresses.length && progresses[index] >= 100) {
                    deployCount++;
                    index++;
                }
                stack.add(deployCount);
            }
        }

        int[] answer = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.get(i);
        }

        return answer;
    }
}
