import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list2 = new ArrayList<>();
        for(Integer i : nums2){
            list2.add(i);
        }
    HashSet<Integer> set = new HashSet<>();
    for(int i = 0;i<nums1.length;i++){
        if(list2.contains(nums1[i])){
            set.add(nums1[i]);
        }
    }
int[] arr = new int[set.size()];
int index = 0;
for(Integer i : set){
    arr[index++] = i;
}


    return arr;
    }
}