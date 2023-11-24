import java.util.Arrays;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = new int [10000];
        int size = 0;

        for (String intStr : intStrs) {
            char[] arr = new char[intStr.length()];
            for (int j = 0; j < intStr.length(); j++) {
                arr[j] = intStr.charAt(j);
            }
            String str = "";
            for (int t = s; t < l+s&& t < intStr.length(); t++) {
                str += arr[t];
            }
            if (Integer.parseInt(str) > k) {
                answer[size] = Integer.parseInt(str);
                size++;
            }
        }

        return Arrays.copyOf(answer, size);
    }
}