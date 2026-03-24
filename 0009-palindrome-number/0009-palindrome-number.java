class Solution {
    public boolean isPalindrome(int xy) {
             String ans = String.valueOf(xy);
        int left = 0;
        int right = ans.length()-1;
while(left<right){
    if(ans.charAt(left)!=ans.charAt(right)){
        return false;
    }
    left++;
    right--;
}
return true;
    }
}