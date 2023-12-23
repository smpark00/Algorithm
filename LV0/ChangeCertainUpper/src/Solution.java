class Solution {
    public String solution(String my_string, String alp) {
        char [] str = my_string.toCharArray();
        for(int i=0; i<my_string.length(); i++){
            if(str[i] == alp.charAt(0)){
                str[i] = (char) (str[i] - 32);
            }
        }
        StringBuilder answer = new StringBuilder();
        for(int j=0; j< str.length; j++){
            answer.append(str[j]);
        }
        return answer.toString();
    }
}