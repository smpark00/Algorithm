class Solution {
    public int solution(String dartResult) {
        int answer[] = new int [3];
        int index = -1;
        for(int i=0; i<dartResult.length(); i++){
            char ch1 = dartResult.charAt(i);
            
            if(Character.isDigit(ch1)){
                index++;
                if(ch1 == '1' && i+1 < dartResult.length() && dartResult.charAt(i+1) == '0'){
                    answer[index] = 10;
                    i++;
                }else{
                    answer[index] = ch1 - '0';
                }
            }else{
                char ch2 = ch1;  
                if (ch2 == 'S') {
                    answer[index] = (int) Math.pow(answer[index], 1);
                } else if (ch2 == 'D') {
                    answer[index] = (int) Math.pow(answer[index], 2);
                } else if (ch2 == 'T') {
                    answer[index] = (int) Math.pow(answer[index], 3);
                } else if (ch2 == '*') {
                    answer[index] *= 2;
                    if (index > 0) {
                        answer[index - 1] *= 2;  
                    }
                } else if (ch2 == '#') {
                    answer[index] *= -1;
                }
            }
        }
        
        int result = 0;
        for(int score : answer){
            result += score;
        }
        return result;
    }
}