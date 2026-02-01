class Solution {
    public boolean isPalindrome(int x) {
        String ans = String.valueOf(x);
        int lefty = 0;
        int right = ans.length()-1;
while(lefty<right){
    if(ans.charAt(lefty)!=ans.charAt(right)){
        return false;
    }
    lefty++;
    right--;
}
return true;
    }
}