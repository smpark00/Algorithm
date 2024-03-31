import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] alphabet = new int[26];

        Arrays.fill(alphabet, -1);

        for(int i=0; i<s.length(); i++){
            char alpha = s.charAt(i);
            if(alphabet[alpha - 'a'] == -1){
                answer[i] = -1;
            }else{
                answer[i] = i-alphabet[alpha-'a'];
            }
            alphabet[alpha-'a'] = i;
        }


        return answer;
    }
}