class Solution {
    public String[] solution(String myStr) {
        String str = myStr;
        str = str.replaceAll("[abc]", " ");
        str = str.replaceAll("\\s+", " ");
        str = str.trim();
        String[] answer = str.split(" ");

        if(answer[0].isEmpty()){
            answer[0] = "EMPTY";
        }
        return answer;
    }
}