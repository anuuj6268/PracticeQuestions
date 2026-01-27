class Solution {
    public int[] twoSum(int[] num, int targets) {
        int arr[]=new int[2];
        for(int i = 0;i<num.length-1;i++){
            for(int j = i+1;j<num.length;j++){
                if(num[i]+num[j]==targets){
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
   return arr;
   }
}