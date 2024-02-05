import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<String> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(String.valueOf(1));
            } else if (s.charAt(i) == ')') {
                if(stack.isEmpty()){
                    answer = false;
                    break;
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()){
            answer = false;
        }
        return answer;
    }
}