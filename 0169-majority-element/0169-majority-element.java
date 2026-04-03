class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for(int i:nums){
            if(map.containsKey(i)){
                int count = map.get(i);
                map.put(i,count+1);
            }
            else{
                map.put(i,1);
            }
        }
Set<Integer> set = map.keySet();
for(Integer i:set){
    if(map.get(i)>nums.length/2 && map.get(i)>max){
        max = i;
    }
}
return max;
    }
}