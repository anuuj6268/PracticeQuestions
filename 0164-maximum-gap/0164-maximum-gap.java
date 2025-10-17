import java.util.Arrays;

class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int num = 0; 
        int j = 0;
    for(int i = 0;i<nums.length-1;i++){
     j = nums[i+1]-nums[i];
if(num<j){
    num = j;
}
    }
if(nums.length==1){
    return 0;
}
return num;
    }
}