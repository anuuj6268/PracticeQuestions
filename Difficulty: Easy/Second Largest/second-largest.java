class Solution {
    public int getSecondLargest(int[] arr) {
        if(arr.length<2){
            return -1;
        }
        
        
        
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
   for(int num:arr){
       if(num>largest){
           secondLargest = largest;
           largest = num;
 
       }
       else if(num!=largest && num>secondLargest){
           secondLargest = num;
       }
   }
   
   if(secondLargest == Integer.MIN_VALUE){
       return -1;
   }
   return secondLargest;
   
    }
}