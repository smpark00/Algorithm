class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int lux = 10000;
        int luy = 10000;
        int rdx = 0;
        int rdy = 0;
        
        for(int i=0; i<wallpaper.length; i++){
            boolean check = false;
            for(int j=0; j<wallpaper[i].length(); j++){
                if(!check && wallpaper[i].charAt(j) == '#'){
                    if(i < lux){
                        lux = i;
                    }
                    if(j < luy){
                        luy = j;
                    }
                    check = true;
                }
                
                if(wallpaper[i].charAt(j) == '#'){
                    if(rdx < i){
                        rdx = i;
                    }
                    if(rdy < j){
                        rdy = j;
                    }   
                }
            }
        }
        answer[0] = lux;
        answer[1] = luy;
        answer[2] = rdx+1;
        answer[3] = rdy+1;
        
        return answer;
    }
}