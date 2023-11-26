class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        int deletesize = 0;
        char [] arr = my_string.toCharArray();
        for(int i=0; i<indices.length; i++){
          int index = indices[i];
          arr[index] = 0;
          deletesize++;
        }
        char [] arr2 = new char [arr.length-deletesize];
        int arr2size=0;
        for(int j=0; j<arr.length; j++){
            if(arr[j] != 0){
                arr2[arr2size] = arr[j];
                arr2size++;
            }
        }
        answer = String.valueOf(arr2);
        return answer;
    }
}