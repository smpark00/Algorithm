import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap <Integer,Integer> map = new HashMap<>();
        
        for(int size: tangerine){
            map.put(size, map.getOrDefault(size,0)+1);
        }
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        
        keySet.sort((size1, size2) -> map.get(size2) - map.get(size1));
        
        for (Integer size : keySet) {
            k -= map.get(size);
            answer++;
            if (k <= 0) {
                break;
            }
        }
        
        return answer;
    }
}