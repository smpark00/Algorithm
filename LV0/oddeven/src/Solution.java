class Solution {
    public int solution(int[] num_list) {
        int even = 0;
        int odd =0;
        for(int i=0; i< num_list.length; i++){
            if(i%2 == 0){
                even = even + num_list[i];
            }else{
                odd = odd + num_list[i];
            }
        }
        if(even > odd){
            return even;
        }
        return odd;

    }
}