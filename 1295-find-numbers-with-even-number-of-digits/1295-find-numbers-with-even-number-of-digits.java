class Solution {
    public int findNumbers(int[] nums) {
        int finalCount = 0;
      for(int i = 0;i<nums.length;i++){
int copy = nums[i];
int count = 0;
while(copy>0){
copy = copy/10;
count++;
}    
if(count%2==0){
    finalCount++;
}  
      }  
      return finalCount;
    }
}