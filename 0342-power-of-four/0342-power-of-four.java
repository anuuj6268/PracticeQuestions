class Solution {
    public boolean isPowerOfFour(int n) {
        for(int i = 0;i<16;i++){
            double answer = Math.pow(4,i);
            if(answer==n){
                return true;
            }
        }
        return false;
    }
}