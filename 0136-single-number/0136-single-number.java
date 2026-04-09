class Solution {
    public int singleNumber(int[] numss) {
        Arrays.sort(numss);
        for (int i = 0; i < numss.length - 1; i += 2) {
            if (numss[i] != numss[i + 1]) {
                return numss[i];
            }
        }
        return numss[numss.length - 1];
    }
}