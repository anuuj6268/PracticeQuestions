import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] num) {
        Arrays.sort(num);
        int smallest1 = 1; 
        
        for (int nu : num) {
            if (nu == smallest1) {
                smallest1++; 
            }
        }
        return smallest1; 
    }
}
