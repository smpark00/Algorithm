import java.lang.Math;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;  // '*' 위치를 10으로 간주
        int right = 12; // '#' 위치를 12로 간주

        for (int num : numbers) {
            if (num == 0) num = 11; // 0을 11로 간주
            
            if (num == 1 || num == 4 || num == 7) {
                left = num;
                answer += "L";
            } else if (num == 3 || num == 6 || num == 9) {
                right = num;
                answer += "R";
            } else {
                // 가운데 키패드(2, 5, 8, 0 -> 11)
                int leftDist = Math.abs(left - num) / 3 + Math.abs(left - num) % 3;
                int rightDist = Math.abs(right - num) / 3 + Math.abs(right - num) % 3;

                if (leftDist < rightDist) {
                    left = num;
                    answer += "L";
                } else if (leftDist > rightDist) {
                    right = num;
                    answer += "R";
                } else {
                    if (hand.equals("right")) {
                        right = num;
                        answer += "R";
                    } else {
                        left = num;
                        answer += "L";
                    }
                }
            }
        }

        return answer;
    }
}
