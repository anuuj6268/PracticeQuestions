class Solution {
    public boolean isPowerOfThree(int number) {
            for(int i=0;i<=30;i++){
                double ans = Math.pow(3,i);
                if(ans==number){
                    return true;
                }
            }
return false;
    }
}