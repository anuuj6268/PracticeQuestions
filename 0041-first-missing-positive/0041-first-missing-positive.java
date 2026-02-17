import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int smalls = 1; 
        
        for (int number : nums) {
            if (number == smalls) {
                smalls++; 
            }
        }
        return smalls; 
    }
}
