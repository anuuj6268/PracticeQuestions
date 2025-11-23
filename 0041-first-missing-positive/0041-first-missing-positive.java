import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] num) {
        Arrays.sort(num);
        int smallest = 1; 
        
        for (int nu : num) {
            if (nu == smallest) {
                smallest++; 
            }
        }
        return smallest; 
    }
}
