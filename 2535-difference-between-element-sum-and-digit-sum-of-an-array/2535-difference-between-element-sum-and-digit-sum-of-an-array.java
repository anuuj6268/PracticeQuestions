class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum = sum + nums[i];
        }
int secondSum = 0;
    for(int i = 0;i<nums.length;i++){
        while(nums[i]!=0){
            secondSum = secondSum + (nums[i]%10);
            nums[i] = nums[i]/10;
        }
    }




return sum-secondSum;

    }
}