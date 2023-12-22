import java.util.Arrays;
class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = new String[str_list.length];
        int count=0;
        for(int i=0; i< str_list.length; i++){
            if(str_list[i].equals("l")){
                for(int j=0; j<i; j++){
                    answer[j] = str_list[j];
                    count++;
                }
                break;
            } else if (str_list[i].equals("r")) {
                for(int j=i+1; j< str_list.length; j++){
                    answer[j-i-1] = str_list[j];
                    count++;
                }
                break;
            }
        }
        return Arrays.copyOf(answer, count);
    }
}