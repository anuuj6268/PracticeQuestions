class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int copy1 = x;
        while(x>0){
            reverse = ((reverse*10)+x%10);
            x = x/10;
        }
if(reverse == copy1){
    return true;
}
return false;
    }
}
