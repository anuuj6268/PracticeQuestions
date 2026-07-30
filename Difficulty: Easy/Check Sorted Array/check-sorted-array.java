class Solution {
    public boolean isSorted(int[] arr) {
   
   
   int temp = arr[0];
   for(int i = 1;i<arr.length;i++){
       if(arr[i]<temp){
           return false;
       }
       else{
           temp = arr[i];
       }
   }
   
 return true;  
    }
}