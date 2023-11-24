class Solution {
    public String solution(String my_string, int n) {
        int size = my_string.length();
        String answer = "";
        for(int i=size-n; i<size; i++){
            answer += my_string.charAt(i);
        }
        return answer;
    }
}