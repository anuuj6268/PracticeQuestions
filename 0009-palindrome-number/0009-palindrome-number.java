class Solution {
    public boolean isPalindrome(int x1) {
        int reverse = 0;
        int copy = x1;
        while(x1>0){
            reverse = ((reverse*10)+x1%10);
            x1 = x1/10;
        }
if(reverse == copy){
    return true;
}
return false;
    }
}
