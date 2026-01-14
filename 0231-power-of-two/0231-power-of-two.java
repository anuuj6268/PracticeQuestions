class Solution {
    public boolean isPowerOfTwo(int num) {
        for(int i=0;i<=30;i++){
        double answer = Math.pow(2,i);
        if(answer==num){
    return true;
}
}
return false;        
    }
}