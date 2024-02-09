import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index=0;

        for (int[] command : commands) {
            int a = command[0];
            int b = command[1];
            int c = command[2];
            int[] arr = new int[b - a + 1];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = array[a - 1 + i];
            }
            Arrays.sort(arr);
            answer[index] = arr[c-1];
            index++;
        }
        return answer;
    }
}