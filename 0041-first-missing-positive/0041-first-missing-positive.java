import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int small = 1; 
        
        for (int nu : nums) {
            if (nu == small) {
                small++; 
            }
        }
        return small; 
    }
}
