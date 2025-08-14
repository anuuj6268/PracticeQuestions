class Solution {
    public String largestGoodInteger(String num) {
        for(int i = 9;i>=0;i--){
String str1 = String.valueOf(i).repeat(3);
    if(num.contains(str1)){
        return str1;
    }

        }
        return "";
    }
}