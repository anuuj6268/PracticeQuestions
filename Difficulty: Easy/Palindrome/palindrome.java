class Solution {
    public boolean isPalindrome(int n) {
    String str = String.valueOf(n);
    int left = 0;
    int right = str.length()-1;
    while(left<right){
        if(str.charAt(left)!=str.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;
    
    }
}