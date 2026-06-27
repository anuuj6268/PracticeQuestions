class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int first = 0;
        for(int i = 0;i<nums.length-2;i++){
            first = nums[i];
            int left = i + 1;
            int right = nums.length-1;
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            while(left<right){
                if(nums[left]+nums[right]>-(first)){
                right--;
                }
                else if(nums[left]+nums[right]<-(first)){
                    left++;
                }
                else{
                  list.add(Arrays.asList(first,nums[left],nums[right]));
                  left++;
                  right--;
                   while(left<right && nums[left]==nums[left-1]){
                    left++;
                   }
                   while(left<right && nums[right]==nums[right+1]){
                    right--;
                   }
                }
            }
        }
return list;
    }
}