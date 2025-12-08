class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumofSingleDigit = 0;
        int sumOfDoubleDigit = 0;
    for(int i = 0;i<num.length;i++){
        if(nums[i]>9){
            sumOfDoubleDigit = sumOfDoubleDigit + nums[i];
        }
        else{
            sumofSingleDigit = sumofSingleDigit + nums[i];
        }
    }

if(sumOfDoubleDigit == sumofSingleDigit){
    return false;
}
return true;
    }
}