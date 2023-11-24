class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        char [] arr = new char[my_string.length()];
        for(int i=0; i< arr.length; i++){
            arr[i] = my_string.charAt(i);
        }
        for(int j=c-1; j< arr.length; j=m+j){
            answer += arr[j];
        }
        return answer;
    }
}