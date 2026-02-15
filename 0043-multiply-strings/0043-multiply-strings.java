import java.math.BigInteger;
class Solution {
    public String multiply(String num, String num2) {
        BigInteger a = new BigInteger(num);
        BigInteger b = new BigInteger(num2);
        BigInteger c = a.multiply(b);
        String str1 = c.toString();
        return str1;

    }
}