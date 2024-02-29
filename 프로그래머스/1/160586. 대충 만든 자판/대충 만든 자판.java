import java.lang.Math;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] alphabet = new int [26];
        int index = 0;
        
        for(int i=0; i<targets.length; i++){
            int count = 0;
            for(int j=0; j<targets[i].length(); j++){
                char ch = targets[i].charAt(j);
                int find = findnum(keymap, ch);
                count += find;
                if(find == 0){
                    count = 0;
                    break;
                }
            }
            
            if(count == 0){
                answer[index] = -1;
            }else{
            answer[index] = count;
            }
            
            index++;
        }
        
        return answer;
    }
    
    public int findnum(String[] keymap, char ch){
        int min = 10000;
        
        for(int i=0; i<keymap.length; i++){
            int count = 0;
            for(int j=0; j<keymap[i].length(); j++){
                count ++;
                 if(keymap[i].charAt(j) == ch && min>count){
                    min = count;
                    break;
                }
            }
        }
        if(min == 10000){
            return 0;
        }
        return min;
    }
}