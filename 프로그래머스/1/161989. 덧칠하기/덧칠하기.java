class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] paint = new boolean[n+1]; // 다시 칠해야되는지 확인하는 배열

        for(int i=0; i<section.length; i++){
            paint[section[i]] = true; // 다시 칠해야되면 true
        }
        
        for(int i=1; i<=paint.length-m; i++){
            if(paint[i]){
                for(int j=0; j<m; j++){
                    paint[i+j] = false;
                }
                answer++;
            }
        }
        
        for(int i=paint.length-m+1; i<paint.length; i++){
            if(paint[i]){
                answer++;
                break;
            }
        }
        
        return answer;
    }
}