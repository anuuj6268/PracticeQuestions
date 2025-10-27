class Solution {
    public int numberOfSteps(int nums) {
        int step = 0;
        while(nums!=0){
            if(nums%2==0){
                nums = nums/2;
                step++;
            }
            else{
                nums = nums-1;
                step++;
            }

        }



return step;
    }
}
