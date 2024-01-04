class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] str = binomial.split(" ");
        int op1 = Integer.parseInt(str[0]);
        int op2 = Integer.parseInt(str[2]);

        if(str[1].equals("+")){
            answer = op1+op2;
        } else if (str[1].equals("-")) {
            answer = op1-op2;
        }else if (str[1].equals("*")) {
            answer = op1*op2;
        }
        return answer;
    }
}