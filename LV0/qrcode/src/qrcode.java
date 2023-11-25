class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        char [] arr = new char[code.length()];
        for(int i=0; i<code.length(); i++){
            arr[i] = code.charAt(i);
        }
        for(int j = r; j< arr.length; j=q+j){
            answer += arr[j];
        }
        return answer;
    }
}