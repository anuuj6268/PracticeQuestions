class Solution {
    public boolean isPowerOfFour(int n) {
        for(int i = 0;i<16;i++){
            double ans = Math.pow(4,i);
            if(ans==n){
                return true;
            }
        }
        return false;
    }
}