class Solution {
    public int[] twoSum(int[] num, int target) {
        int arr1[]=new int[2];
        for(int i = 0;i<num.length-1;i++){
            for(int j = i+1;j<num.length;j++){
                if(num[i]+num[j]==target){
                    arr1[0]=i;
                    arr1[1]=j;
                }
            }
        }
   return arr1;
   }
}
