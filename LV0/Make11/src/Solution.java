class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i=0; i< num_list.length; i++){
            int count = 0;
            int a = num_list[i];
            while(a !=1){
                if(a%2 == 1){
                    a = (a-1)/2;
                    count++;
                }else {
                    a = a/2;
                    count++;
                }
                if(a == 1){
                    answer += count;
                }
            }
        }
        return answer;
    }
}