class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String [] str = new String [my_string.length()];
        for(int i=0; i< str.length; i++){
            if(i==0){
                str[i] = String.valueOf(my_string.charAt(i));
            }else {
                str[i] = str[i-1] + my_string.charAt(i);
            }
            if(str[i].equals(is_prefix)){
                answer++;
            }
        }
        return answer;
    }
}