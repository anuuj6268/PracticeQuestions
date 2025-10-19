import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int smallest1 = 1; 
        
        for (int num : nums) {
            if (num == smallest1) {
                smallest1++; 
            }
        }
        return smallest1; 
    }
}
