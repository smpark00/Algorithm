class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int [52];
        for(int i=0; i<my_string.length(); i++){
            char str = my_string.charAt(i);
            int strascii = (byte) str;
            if(strascii >= 'a'){
                answer[strascii - 'A' -6] += 1;
            }else{
                answer[strascii - 'A'] += 1;
            }
        }
        return answer;
    }
}