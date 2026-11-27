class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int index = 0;
        for(int num : nums){
            int search = target-num;
            if(map.containsKey(search)){
                return new int[]{map.get(search),index};
            }
            else{
                map.put(num,index);
            }
            index++;
        }
return new int[]{-1,-1};
    }
}