import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] num) {
        Arrays.sort(num);
        int small = 1; 
        
        for (int nu : num) {
            if (nu == small) {
                small++; 
            }
        }
        return small; 
    }
}
