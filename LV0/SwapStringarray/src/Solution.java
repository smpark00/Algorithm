class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        StringBuilder ans= new StringBuilder();
        for(int i=s; i<=e; i++){
            ans.append(my_string.charAt(i));
        }
        String str = String.valueOf(ans.reverse());
        answer += my_string.substring(0,s);
        answer += str;
        answer += my_string.substring(e+1);

        return answer;
    }
}