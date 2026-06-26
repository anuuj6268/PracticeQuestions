class Solution {
    public int removeDuplicates(int[] nums) {
        int unique = 0;

        for(int next = 1;next<nums.length;next++){
            if(nums[unique]!=nums[next]){
                unique++;
                nums[unique] = nums[next];
            }
        }
        return unique+1;
    }
}