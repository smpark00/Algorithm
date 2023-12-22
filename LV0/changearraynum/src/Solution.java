class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int [num_list.length];
        for(int i=0; i< num_list.length-n; i++){
            answer[i] = num_list[n+i];
        }
        for(int j= num_list.length-n; j< num_list.length; j++){
            answer[j] = num_list[j- num_list.length+n];
        }
        return answer;
    }
}