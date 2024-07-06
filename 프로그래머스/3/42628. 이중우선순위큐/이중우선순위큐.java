import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(String[] operations) {
        ArrayList<Integer> queue = new ArrayList<>();
        int[] answer = new int[2];
        
        for(int i=0; i<operations.length; i++){
            if(operations[i].charAt(0) == 'I'){
                int newnum = Integer.parseInt(operations[i].substring(2));
                queue.add(newnum);
            }else if(!queue.isEmpty() && operations[i].charAt(0) == 'D' && operations[i].charAt(2) == '-'){
                Collections.sort(queue);
                queue.remove(0);
            }else if(!queue.isEmpty() && operations[i].charAt(0) == 'D' && operations[i].charAt(2) == '1'){
                Collections.sort(queue, Collections.reverseOrder());
                queue.remove(0);
            }
        }
        
        if(!queue.isEmpty()){
            Collections.sort(queue);
            answer[0] = queue.get(queue.size()-1);
            answer[1] = queue.get(0);
        } else {
            answer[0] = 0;
            answer[1] = 0;
        }
        
        return answer;
    }
}