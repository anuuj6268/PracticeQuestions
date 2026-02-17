import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int smalls = 1; 
        
        for (int num : nums) {
            if (num == smalls) {
                smalls++; 
            }
        }
        return smalls; 
    }
}
