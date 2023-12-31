import java.util.Arrays;
class Solution {
    public int[] solution(String myString) {
        int xcount = 0;
        int notxcount = 0;
        int[] answer = new int [myString.length()];
        for (int i=0; i<myString.length(); i++){
            if(myString.charAt(i) == 'x'){
                answer[xcount] = notxcount;
                notxcount = 0;
                xcount++;
            }else {
                notxcount++;
            }
            if(i == myString.length()-1){
                answer[xcount] = notxcount;
                xcount++;
            }
        }
        return Arrays.copyOf(answer,xcount);
    }
}