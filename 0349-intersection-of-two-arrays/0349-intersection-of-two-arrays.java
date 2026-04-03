class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> num1Set = new HashSet<>();
        HashSet<Integer> num2Set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();
    for(int i : nums1){
        num1Set.add(i);
    }
    for(int i : nums2){
        num2Set.add(i);
    }
for(Integer i : num1Set){
    if(num2Set.contains(i)){
        intersection.add(i);
    }
}
int arr[] = new int[intersection.size()];
    int index = 0;
for(Integer i : intersection){
    arr[index] = i;
    index++;
}
return arr;
    }
}