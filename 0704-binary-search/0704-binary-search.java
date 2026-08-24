class Solution {
    public int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]>target){
                right = mid;
                right--;
            }
            else if(arr[mid]<target){
                left = mid;
                left++;
            }
            else{
                return mid;
            }

        }
        return -1;
    }
}