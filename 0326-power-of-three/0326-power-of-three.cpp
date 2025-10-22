class Solution {
public:
    bool isPowerOfThree(int number) {
        if (number <= 0) return false;
        while (number % 3 == 0) {
            number /= 3;
        }
        return number == 1;
    }
};