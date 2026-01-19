class Solution {
    public int[] twoSum(int[] num, int target) {
        int array[]=new int[2];
        for(int i = 0;i<num.length-1;i++){
            for(int j = i+1;j<num.length;j++){
                if(num[i]+num[j]==target){
                    array[0]=i;
                    array[1]=j;
                }
            }
        }
   return array;
   }
}