class Solution {
    public int removeElement(int[] nums, int value) {
        
        int slow = 0;
for(int i = 0;i<nums.length;i++){
    if(nums[i]!=value){
        nums[slow] = nums[i];
        slow++;
    }
}
return slow;
    }
}