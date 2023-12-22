import java.util.Arrays;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = new String[todo_list.length];
        int count = 0;
        for(int i=0; i<todo_list.length; i++){
            if(!finished[i]){
                answer[count] = todo_list[i];
                count++;
            }
        }
        return Arrays.copyOf(answer,count);
    }
}