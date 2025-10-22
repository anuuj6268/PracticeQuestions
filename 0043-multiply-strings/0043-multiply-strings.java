import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        BigInteger ch = a.multiply(b);
        String str = ch.toString();
        return str;

    }
}
