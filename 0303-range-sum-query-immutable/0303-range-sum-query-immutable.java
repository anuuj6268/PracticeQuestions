class NumArray {
ArrayList<Integer> list = new ArrayList<>();
    public NumArray(int[] nums) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum = sum+nums[i];
            list.add(sum);
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0 && right == 0){
            return list.get(0);
        }
        else if(left==0){
            return list.get(right);
        }
        return list.get(right)-list.get(left-1);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */