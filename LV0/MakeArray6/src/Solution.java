import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
            } else if (stk.get(stk.size() - 1) == arr[i]) {
                stk.remove(stk.size() - 1);
            } else if (stk.get(stk.size() - 1) != arr[i]) {
                stk.add(arr[i]);
            }
            i++;
        }

        int[] result;
        if (stk.isEmpty()) {
            result = new int[]{-1};
        } else {
            result = new int[stk.size()];
            for (int j = 0; j < stk.size(); j++) {
                result[j] = stk.get(j);
            }
        }

        return result;
    }
}
