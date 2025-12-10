import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int small = 1; 
        
        for (int num : nums) {
            if (num == small) {
                small++; 
            }
        }
        return small; 
    }
}
