import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        int num = -1;
        int len = -1;
        p--;
        
        while(answer.length() < t){
            num++;
            String tmp = Integer.toString(num, n).toUpperCase();
            for(int i=0; i<tmp.length(); i++){
                len++;
                if((len % m) == p && answer.length() < t){
                    char ch = tmp.charAt(i);
                    answer.append(ch);
                }
            }
        }
        
        return answer.toString();
    }
}