import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int depth = triangle.length-2;
        
        while(depth >= 0){
            for(int i=0; i<=depth; i++){
                triangle[depth][i] += Math.max(triangle[depth+1][i], triangle[depth+1][i+1]);
            }
            
            depth--;
        }
        
        return triangle[0][0];
    }
}