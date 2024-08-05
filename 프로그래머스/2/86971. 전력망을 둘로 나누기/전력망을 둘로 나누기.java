import java.util.*;
import java.lang.Math;

class Solution {
    private static boolean [][] map;
    private static boolean [] check;
    
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        
        for(int i=0; i<wires.length; i++){
            map = new boolean[n][n];
            check = new boolean[n];
            
            for(int j=0; j<wires.length; j++){
                if(i == j) continue;
                
                int a = wires[j][0] - 1;
                int b = wires[j][1] - 1;
                map[a][b] = true;
                map[b][a] = true;
            }
            
            int count = dfs(0);
            int another = n - count;
            int result = Math.abs(count-another);
            
            if(result < answer){
                answer = result;
            }
        }
        
        return answer;
    }
    
    public static int dfs(int index){
            int count = 1;
            check[index] = true;
        
            for(int i = 0; i<map.length; i++){
                if(map[index][i] && !check[i]){
                    count += dfs(i);
                }
            }
            return count;
        }
}