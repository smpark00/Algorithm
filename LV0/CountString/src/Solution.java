class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int index = myString.indexOf(pat);

        while (index != -1){
            answer++;
            myString = myString.substring(index+1);
            index = myString.indexOf(pat);
        }

        return answer;
    }
}