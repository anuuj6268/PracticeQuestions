import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(Integer num:arr){
            list.add(num);
        }
        HashSet<Integer> set = new HashSet<>(list);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(Integer num:set){
            int count = Collections.frequency(list,num);
            map.put(num,count);
        }
Collection<Integer> getValues = map.values();
Integer[] nums = getValues.toArray(new Integer[0]);
for(int i = 0;i<nums.length-1;i++){
    for(int j = i+1;j<nums.length;j++){
        if(nums[i].equals(nums[j])){
            return false;
        }
    }
}
return true;
    }
}