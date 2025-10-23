class Solution {
    public boolean isThree(int n) {
        int count1 = 0;
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                count1++;
            }
        }
        if(count1==3){
            return true;
        }
return false;    }
}
