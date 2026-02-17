class Solution {
    public void bubbleSort(int[] arr) {
        for(int turn = 0;turn<arr.length-1;turn++){
            for(int i = 0;i<arr.length-1-turn;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        
        
        
    }
}