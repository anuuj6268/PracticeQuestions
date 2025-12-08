class Solution {
    public boolean canAliceWin(int[] num) {
        int sumofSingleDigit = 0;
        int sumOfDoubleDigit = 0;
    for(int i = 0;i<num.length;i++){
        if(num[i]>9){
            sumOfDoubleDigit = sumOfDoubleDigit + num[i];
        }
        else{
            sumofSingleDigit = sumofSingleDigit + num[i];
        }
    }

if(sumOfDoubleDigit == sumofSingleDigit){
    return false;
}
return true;
    }
}