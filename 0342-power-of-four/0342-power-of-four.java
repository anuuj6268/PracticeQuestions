class Solution {
    public boolean isPowerOfFour(int num) {
        for(int i = 0;i<16;i++){
            double answer = Math.pow(4,i);
            if(answer==num){
                return true;
            }
        }
        return false;
    }
}