class Solution {
    public boolean isPowerOfThree(int n) {
            for(int i=0;i<=30;i++){
                double answ = Math.pow(3,i);
                if(answ==n){
                    return true;
                }
            }
return false;
    }
}