import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int smallest1 = 1; 
        
        for (int nu : nums) {
            if (nu == smallest1) {
                smallest1++; 
            }
        }
        return smallest1; 
    }
}
