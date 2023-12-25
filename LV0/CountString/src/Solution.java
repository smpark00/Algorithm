class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for(int i=0; i<myString.length(); i++){
            if(myString.contains(pat)){
                answer++;
                int a = myString.indexOf(pat);
                myString= myString.substring(a+1);
            }
        }

        return answer;
    }
}