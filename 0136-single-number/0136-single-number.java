class Solution {
    public int singleNumber(int[] nums11) {
        Arrays.sort(nums11);
        for(int i = 0;i<nums11.length-1;i+=2){
            if(nums11[i]!=nums11[i+1]){
                return nums11[i];
            }
        }
return nums11[nums11.length-1];
}
}