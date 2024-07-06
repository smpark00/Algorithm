import java.lang.Math;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int [2];
        int total = brown + yellow;
        
        for(int i=1; i<=Math.sqrt(total); i++){
            if(total % i == 0){
                int width = total/i;
                int length = i;
            
                int countbrown = 2*(width+length) - 4;
                int countyellow = total - countbrown;
                
                if(brown == countbrown && yellow == countyellow){
                    answer[0] = width;
                    answer[1] = length;
                    break;
                }
            }
        }
        return answer;
    }
}