class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int length = 0;

        
        for(int i=0; i<sizes.length; i++){
            width = Math.max(width, Math.max(sizes[i][0], sizes[i][1]));
            length = Math.max(length, Math.min(sizes[i][0], sizes[i][1]));
        }
        return width*length;
    }
}