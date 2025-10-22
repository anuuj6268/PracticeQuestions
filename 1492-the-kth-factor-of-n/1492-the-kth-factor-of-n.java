class Solution {
    public int kthFactor(int n, int k) {
        int[] arr = new int[n];
        int count1  = 0;
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                arr[count1]=i;
                count1++;
            }
        }
   int value = arr[k-1];
   if(value==0){
   return -1;
   }
      return value;
    }
}