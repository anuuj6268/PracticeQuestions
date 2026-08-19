class Solution {
    public int[] twoSum(int[] num, int target) {
        int arry[] = new int[2];
        for(int i = 0;i<num.length;i++){
            for(int j = i+1;j<num.length;j++){
                if(num[i]+num[j]==target){
                arry[0] = i;
                arry[1] = j;
                }
            }
        }
        return arry;
    }
}