class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int j = 0; j < nums.length - 1; j += 2) {
            if (nums[j] != nums[j + 1]) {
                return nums[j];
            }
        }
        return nums[nums.length - 1];
    }
}