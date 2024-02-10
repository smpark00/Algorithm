import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] count = new int[4];
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};

        for (int i=0; i< answers.length; i++){
            int a = answers[i];
            if(one[i%5] == a){
                count[1]++;
            }
            if(two[i%8] == a){
                count[2]++;
            }
            if(three[i%10] == a){
                count[3]++;
            }
        }
        
        int max = Math.max(count[1],Math.max(count[2],count[3]));
        
        for(int i=1; i<=3; i++){
            if(count[i] == max){
                ans.add(i);
            }
        }
        
        return ans;
    }
}