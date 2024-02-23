import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;

        for (int i = 0; i < n; i++){
            int hIndex = n - i;

            if (citations[i] >= hIndex) {
                return hIndex;
            }
        }

        return 0;
    }
}
