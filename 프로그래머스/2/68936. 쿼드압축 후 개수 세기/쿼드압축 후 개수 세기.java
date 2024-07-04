class Solution {
    private int zerocount = 0;
    private int onecount = 0;
    
    public int[] solution(int[][] arr) {
        recur(arr, 0, 0, arr.length);
        
        int[] answer = {zerocount, onecount};
        return answer;
    }
    
    public void recur(int[][] arr, int x, int y, int length){
        int mid = length/2;
        
        if(length == 1){
            if(arr[x][y] == 0){
                zerocount++;
            }else if (arr[x][y] == 1){
                onecount++;
            }
            return;
        }
        
        if(zip(arr, x, y, length) == true){
            int standard = arr[x][y];
            if(standard == 0){
                zerocount++;
            }else if(standard == 1){
                onecount++;
            }
            for(int i=x; i<x+length; i++){
                for(int j=y; j<y+length; j++){
                    arr[i][j] = -1;
                }
            }
            return;
        }
        
        recur(arr, x, y, mid);
        recur(arr, x+mid, y, mid);
        recur(arr, x, y+mid, mid);
        recur(arr, x+mid, y+mid, mid);
    }
    
    public boolean zip(int[][] arr, int x, int y, int length){
        int standard = arr[x][y];
        for(int i=x; i<x+length; i++){
            for(int j=y; j<y+length; j++){
                if(arr[i][j] != standard){
                    return false;
                }
            }
        }
        return true;
    }
}