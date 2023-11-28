import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = new int [num_list.length];
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        int size = 0;


        if(n==1){
            for(int i=0; i<=b; i++){
                answer[i] = num_list[i];
                size = b+1;
            }
        } else if (n==2) {
            for(int i=a; i< num_list.length; i++ ){
                answer[size] = num_list[i];
                size++;
            }
        } else if (n==3) {
            for(int i=a; i<=b; i++){
                answer[size] = num_list[i];
                size++;
            }
        } else if(n==4){
            for(int i=a; i<=b; i=i+c){
                answer[size] = num_list[i];
                size++;
            }
        }
        return Arrays.copyOf(answer,size);
    }
}