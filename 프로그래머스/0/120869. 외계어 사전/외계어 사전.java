class Solution {
    public int solution(String[] spell, String[] dic) {
        
        for(int i=0; i<dic.length; i++){
            boolean []check = new boolean [spell.length];
            
            for(int j=0; j<dic[i].length(); j++){
                for(int k=0; k<spell.length; k++){
                    if(String.valueOf(dic[i].charAt(j)).equals(spell[k])){
                        check[k] = true;
                    }
                }
            }
            for(int p=0; p<check.length; p++){
                if(!check[p]){
                    break;
                }
                if(p == check.length -1){
                    return 1;
                }
            }
        }
        return 2;
    }
}