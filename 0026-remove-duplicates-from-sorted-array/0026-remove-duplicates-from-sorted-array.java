class Solution {
    public int removeDuplicates(int[] arr) {
        if(arr.length==0) return 0;

        int lefty = 0;
        int right = 1;
        while(right<arr.length){
            if(arr[lefty]==arr[right]){
                right++;
            }
            else{
                lefty++;
                arr[lefty] = arr[right];
                right++;
            }
        }


return lefty+1;
    }
}