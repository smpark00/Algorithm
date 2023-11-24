class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String [] str = new String[my_string.length()];
        for(int i = 0; i<my_string.length(); i++){
            str[i] = my_string.substring(i);
            if(str[i].equals(is_suffix)){
                answer++;
            }
        }
        return answer;
    }
}