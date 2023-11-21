class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char[] strarray = my_string.toCharArray();
        for(int i = 0; i<queries.length; i++){
            int a = queries[i][0];
            int b = queries[i][1];
            char [] temp = new char[b-a+1];
            for(int j = 0; j<temp.length; j++){
                temp[j] = strarray[a+j];
            }
            for(int k=0; k< temp.length; k++){
                strarray[a+k] = temp[a+b-k];
            }
        }
        for(int i = 0; i<my_string.length(); i++){
            answer += strarray[i];
        }
        return answer;
    }
}