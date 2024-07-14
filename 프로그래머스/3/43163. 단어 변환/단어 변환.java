import java.util.*;
import java.lang.Math;

class Solution {
    private boolean[] check;
    private ArrayList<String> word; 
    private int answer = Integer.MAX_VALUE;
    
    public int solution(String begin, String target, String[] words) {
        word = new ArrayList<>(Arrays.asList(words));
        check = new boolean[words.length];
        
        if(!word.contains(target)){
            return 0;
        }
        
        dfs(begin, target, 0);
        
        return answer == Integer.MAX_VALUE ? 0 : answer;
    }
    
    public void dfs(String begin, String target, int count){
        if(begin.equals(target)){
            answer = Math.min(answer, count);
            return;
        }
        
        for(int i = 0; i < word.size(); i++){
            if(!check[i] && canTransform(begin, word.get(i))){
                check[i] = true;
                dfs(word.get(i), target, count + 1);
                check[i] = false;
            }
        }
    }
    
    private boolean canTransform(String s1, String s2) {
        int diff = 0;
        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                diff++;
            }
            if(diff > 1) return false;
        }
        return diff == 1;
    }
}