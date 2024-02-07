class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int time = 1;
        int attackindex = 0;
        int healtime = 0;
        int presenthealth = health;

        while (time <= attacks[attacks.length-1][0]){
            if(time == attacks[attackindex][0]){
                presenthealth -= attacks[attackindex][1];
                healtime = 0;
                if(presenthealth<=0){
                    System.out.println("으악");
                    return -1;
                }
                attackindex++;
            }else {
                healtime++;
                presenthealth += bandage[1];
                if(healtime == bandage[0]){
                    presenthealth += bandage[2];
                    healtime = 0;
                    System.out.println("힐링");
                }
            }
            if(presenthealth > health){
                presenthealth = health;
            }
            time++;
        }
        return presenthealth;
    }
}

