class Solution {
    public int searchInsert(int[] nums, int target) {
        int counts = -1;
        
        for(int i = 0;i<nums.length;i++){
if(nums[i]==target){
counts = i;
break;
}
if(nums[i]>target){
    counts = i;
    break;
}
        }
 if(counts==-1){
    counts = nums.length;
 }
        return counts;
    }
}