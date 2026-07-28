class Solution {
    public int maxSubarraySum(int[] arr, int k) {
    int curr = 0;
    for(int i = 0;i<k;i++){
        curr = curr + arr[i];
    }
int max = curr;
for(int j = 1;j<arr.length-k+1;j++){
   curr = curr - arr[j-1]+arr[j+k-1];
    if(curr>max){
        max = curr;
    }
}

return max;
    }
}