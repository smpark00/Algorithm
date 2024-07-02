class Solution {
    public int[][] solution(int n) {
        int total = 1;
        for(int i=1; i<n; i++){
            total = 2*total+1;
        }
        int[][] answer = new int[total][2];
        
        hanoi(n, 1, 3, 2, 0, answer);
            
        return answer;
    }
    
    public int hanoi(int size, int start, int end, int waypoint, int count, int[][] answer){
        if(size == 1){
            answer[count][0] = start;
            answer[count][1] = end;
            count++;
        }else{
            count = hanoi(size-1, start, waypoint, end, count, answer);
            answer[count][0] = start;
            answer[count][1] = end;
            count++;
            count = hanoi(size-1, waypoint, end, start, count, answer);
        }
        return count;
    }
}