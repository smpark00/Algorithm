class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] str = myString.toCharArray();
        for(int i=0; i<str.length; i++){
            if(str[i] == 'a'){
                str[i] = (char) (str[i] - 32);
            } else if (65<str[i] && str[i]<=90) {
                str[i] = (char) (str[i] + 32);
            }
            answer = answer + str[i];
        }
        return answer;
    }
}