class Solution {
    public int dominantIndex(int[] nums) {
int[] temp = new int[nums.length];
for(int i = 0;i<nums.length;i++){
    temp[i] = nums[i];
}

Arrays.sort(nums);
int max = nums[nums.length-1];

for(int i = 0;i<nums.length-1;i++){
    if(nums[i]*2>max){
        return -1;
    }
}
int count = 0;
for(int i = 0;i<temp.length;i++){
    if(temp[i]==max){
        count = i;
        break;
    }
}
return count;
    }
}