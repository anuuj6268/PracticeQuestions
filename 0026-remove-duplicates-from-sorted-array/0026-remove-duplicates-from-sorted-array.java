class Solution {
    public int removeDuplicates(int[] nums) {
        int uniqueElement = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[uniqueElement] = nums[i];
                uniqueElement++;
            }
        }
        return uniqueElement;
    }
}