class Solution {
    public int singleNumber(int[] nums1) {
        Arrays.sort(nums1);
        for(int i = 0;i<nums1.length-1;i+=2){
            if(nums1[i]!=nums1[i+1]){
                return nums1[i];
            }
        }
return nums1[nums1.length-1];
}
}