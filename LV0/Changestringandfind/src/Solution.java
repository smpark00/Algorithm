class Solution {
    public int solution(String myString, String pat) {
        for(int i=0; i<myString.length()-pat.length()+1; i++){
            int count =0;
            if(myString.charAt(i) != pat.charAt(0)){
                count++;
                for(int j=1; j<pat.length(); j++){
                    if(myString.charAt(i+j) != pat.charAt(j)){
                        count++;
                    }else {
                        break;
                    }
                }
            }
            if(count == pat.length()){
                return 1;
            }
        }
        return 0;
    }
}