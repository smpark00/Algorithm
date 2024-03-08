class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int oneindex = 0;
        int twoindex = 0;
        
        for(int i=0; i<goal.length; i++){
            if(oneindex < cards1.length && goal[i].equals(cards1[oneindex])){
                oneindex++;
            }else if(twoindex < cards2.length && goal[i].equals(cards2[twoindex])){
                twoindex++;
            }else{
                return "No";
            }
        }
        return "Yes";
    }
}