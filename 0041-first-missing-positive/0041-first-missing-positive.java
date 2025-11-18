import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int smallest = 1; 
        
        for (int nu : nums) {
            if (nu == smallest) {
                smallest++; 
            }
        }
        return smallest; 
    }
}
