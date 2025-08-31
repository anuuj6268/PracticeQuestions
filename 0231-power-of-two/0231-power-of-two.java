class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=0;i<=30;i++){
        double answer = Math.pow(2,i);
        if(answer==n){
    return true;
}
}
return false;        
    }
}