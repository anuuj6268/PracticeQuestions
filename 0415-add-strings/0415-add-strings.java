import java.math.*;
class Solution {
    public String addStrings(String numA, String numB) {
        BigInteger a = new BigInteger(numA);
        BigInteger b = new BigInteger(numB);
        BigInteger c = a.add(b);
        String sum = c.toString();
        return sum;

    }
}