import java.util.Arrays;

class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int number = 0; 
        int j = 0;
    for(int i = 0;i<nums.length-1;i++){
     j = nums[i+1]-nums[i];
if(number<j){
    number = j;
}
    }
if(nums.length==1){
    return 0;
}
return number;
    }
}