class Solution {
public int signFunc(int x){
    if(x>0){
        return 1;
    }
if(x<0){
return -1;
}
return 0;
}

    public int arraySign(int[] nums) {
             int sign = 1;
        for(int i : nums){
            int s = signFunc(i);
         if(s==0){
            return 0;
         }
sign = sign*s;

        }

return sign;

    }
}