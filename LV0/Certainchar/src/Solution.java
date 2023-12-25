class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int index = myString.lastIndexOf(pat);
        for(int i=0; i<index+pat.length(); i++){
            answer  += myString.charAt(i);
        }

        return answer;
    }
}