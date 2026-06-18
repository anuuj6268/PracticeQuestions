class Solution {
    public int removeElement(int[] nums, int val) {
        
        int slower = 0;
for(int i = 0;i<nums.length;i++){
    if(nums[i]!=val){
        nums[slower] = nums[i];
        slower++;
    }

    
}
return slower;
    }
}