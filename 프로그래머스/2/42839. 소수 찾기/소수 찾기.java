import java.util.*;

class Solution {
    static Set<Integer> set;
    static boolean[] check; // 해당 숫자가 이미 참조가 되었는지

    public int solution(String numbers) {
        int answer = 0;
        check = new boolean[numbers.length()];
        set = new HashSet<>(); // 중복제거
        dfs(numbers, "", 0);
        
        for (Integer num : set) { // 모든 HashSet들을 탐색하여 소수판별
            if (isPrime(num)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public void dfs(String numbers, String s, int depth){ // 재귀적으로 완전탐색
        if(depth >= numbers.length()){
            return;
        }
        
        for(int i=0; i<check.length; i++){
            if(!check[i]){
                check[i] = true;
                set.add(Integer.parseInt(s+numbers.charAt(i)));
                dfs(numbers, s+numbers.charAt(i), depth+1);
                check[i] = false;
            }
        }
    }

    // 소수 판별 메서드
    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
