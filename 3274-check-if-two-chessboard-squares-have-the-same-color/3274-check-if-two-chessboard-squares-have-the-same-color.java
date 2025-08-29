class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        char[] ch1 = coordinate1.toCharArray();
        char[] ch2 = coordinate2.toCharArray();       
        int num1 = (int)ch1[0]+(int)ch1[1];
        int num2 = (int)ch2[0]+(int)ch2[1];
        if((num1%2==0)&&(num2%2==0)){
            return true;
        }
        else if((num1%2!=0)&&(num2%2!=0)){
            return true;
        }
        return false;
    }
}