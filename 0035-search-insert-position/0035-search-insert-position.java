class Solution {
    public int searchInsert(int[] nums, int target) {
        int count = -1;
        
        for(int i = 0;i<nums.length;i++){
if(nums[i]==target){
count = i;
break;
}
if(nums[i]>target){
    count = i;
    break;
}
        }
 if(count==-1){
    count = nums.length;
 }
        return count;
    }
}