class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0;i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;
            int target = -nums[i];
            if(i>0 && nums[i]==nums[i-1])continue;

            while(left<right){
                int sum = nums[left]+nums[right];

                if(sum==target){
        List<Integer> arr = new ArrayList<>();
                    arr.add(-target);
                    arr.add(nums[left]);
                    arr.add(nums[right]);
                    list.add(arr);
                    while(left<right && nums[left]==nums[left+1]){
                        left++;
                    }
                    while(left<right && nums[right]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }
                
                else if(sum>target){
                    right--;

                }
                else{
                    left++;

                }
            }

        }


return list;
    }   
}