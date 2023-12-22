class Solution {
    public int[] solution(int[] num_list, int n) {
        for(int i=0; i<n; i++){
            int temp = num_list[0];
            for(int j=0; j< num_list.length-1; j++){
                num_list[j] = num_list[j+1];
            }
            num_list[num_list.length-1] = temp;
        }
        return num_list;
    }
}