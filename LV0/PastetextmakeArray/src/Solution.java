class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char [] str = new char[my_string.length()];
        for(int i=0; i< str.length; i++){
            str[i] = my_string.charAt(i);
        }
        for(int j=0; j< index_list.length; j++){
            answer += str[index_list[j]];
        }
        return answer;
    }
}