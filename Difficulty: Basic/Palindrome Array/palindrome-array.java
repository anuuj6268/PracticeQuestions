
class Solution {
    public static boolean isPerfect(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left]!=arr[right]){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}
