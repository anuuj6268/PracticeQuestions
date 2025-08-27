class Solution {
    public int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;
        int pass = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2==0){
                if(nums[i]%3==0){
                    sum = sum+nums[i];
                    count++;
                }
            }
        }
    if(sum>count){
        if(count>0){
            pass = sum/count;
        }
    }



        return pass;
    }
}