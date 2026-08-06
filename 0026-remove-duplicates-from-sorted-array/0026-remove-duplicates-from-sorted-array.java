class Solution {
    public int removeDuplicates(int[] arr) {
        if(arr.length==0) return 0;

        int left = 0;
        int right = 1;
        while(right<arr.length){
            if(arr[left]==arr[right]){
                right++;
            }
            else{
                left++;
                arr[left] = arr[right];
                right++;
            }
        }


return left+1;
    }
}