class Solution {
    static int count;
    static int[] num;
    static int tar;

    public int solution(int[] numbers, int target) {
        count = 0;
        num = numbers;
        tar = target;

        dfs(0, 0);
        return count;
    }

    private void dfs(int index, int calculate) {
        if(index == num.length){
            if(calculate == tar){
                count++;
            }
            return;
        }
        dfs(index+1, calculate+num[index]);
        dfs(index+1, calculate-num[index]);
    }
}