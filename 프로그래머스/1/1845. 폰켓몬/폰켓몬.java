import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int len = nums.length/2;

        HashSet<Integer> poketmon = new HashSet<>();
        for(int num: nums){
            poketmon.add(num);
        }
        
        if(poketmon.size() > len){
            return len;
        }else {
            return poketmon.size();
        }
    }
}