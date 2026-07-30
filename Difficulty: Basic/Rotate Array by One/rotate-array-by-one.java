class Solution {
    public void rotate(int[] arr) {
    int temp = arr[arr.length-1];
    if(arr.length<2) return;
    
    for(int i = arr.length-1;i>0;i--){
        arr[i]=arr[i-1];
    }
  arr[0] = temp;
    }
}