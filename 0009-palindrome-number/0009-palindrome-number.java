class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int copy = x;
        while(x>0){
            reverse = ((reverse*10)+x%10);
            x = x/10;
        }
if(reverse == copy){
    return true;
}
return false;
    }
}
