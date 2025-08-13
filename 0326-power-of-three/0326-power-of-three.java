class Solution {
    public boolean isPowerOfThree(int n) {
            for(int i=0;i<=30;i++){
                double ans = Math.pow(3,i);
                if(ans==n){
                    return true;
                }
            }
return false;
    }
}