class Solution {
    public int[] sortedSquares(int[] nums) {
     int[] arr = new int[nums.length];
     int left = 0;
     int right = nums.length-1;
     int index = nums.length-1;
     while(left<=right){
        if(Math.abs(nums[left])>Math.abs(nums[right])){
            arr[index] = nums[left]*nums[left];
            index--;
            left++;
        }
        else{
            arr[index] = nums[right]*nums[right];
            index--;
            right--;
        }
     }
return arr;
    }
}