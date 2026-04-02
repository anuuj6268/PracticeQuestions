class Solution {
    public boolean isPowerOfThree(int num) {
            for(int i=0;i<=30;i++){
                double ans = Math.pow(3,i);
                if(ans==num){
                    return true;
                }
            }
return false;
    }
}