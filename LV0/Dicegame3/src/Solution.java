import java.util.Arrays;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int [] dice = {a,b,c,d};
        Arrays.sort(dice);

        if( (a==b) && (b==c) && (c==d)){
            return a*1111;
        }else if( (a!=b) && (b!=c) && (c!=d) && (a!=d) ){
            return dice[0];
        }else if((dice[0]!=dice[1]) && (dice[1] == dice[3]) || (dice[2] != dice[3]) && (dice[0] == dice[2])){
            int q = dice[0];
            if(dice[0] == dice[1]){
                q=dice[3];
            }
            return (10 * dice[1] + q)*(10 * dice[1] + q);
        } else if ((dice[0] == dice[1]) && (dice[2] == dice[3]) && (dice[1] != dice[2])) {
            int p = dice[0];
            int q = dice[2];
            if(p>q){
                return (p+q)*(p-q);
            }else{
                return (p+q)*(q-p);
            }
        }else {
            if(dice[0] == dice[1]){
                return dice[2]*dice[3];
            } else if (dice[1] == dice[2]) {
                return dice[0]*dice[3];
            } else if (dice[2] == dice[3]) {
                return dice[0]*dice[1];
            } else {
                return 0;
            }
        }
    }
}

