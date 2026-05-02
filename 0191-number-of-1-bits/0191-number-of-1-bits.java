class Solution {
    public int hammingWeight(int number) {
        int num = 0;
        while (number != 0) {
            num = num + (number % 2);
            number = number / 2;
        }
        return num;
    }
}