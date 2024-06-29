class Solution {
    public String solution(String phone_number) {
        int size = phone_number.length();
        phone_number = phone_number.substring(size-4, size);
        String answer = ""; 
        
        for(int i=0; i<size-4; i++){
            answer += "*";
        }
        answer += phone_number;
        
        return answer;
    }
}