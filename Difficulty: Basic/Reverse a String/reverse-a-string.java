// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        
        String ans = "";
        for(int i = s.length()-1;i>=0;i--){
            ans = ans + s.charAt(i);
        }
        return ans;

    }
}