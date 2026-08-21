class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] arr = new int[nums1.length];
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<nums2.length;i++){
            while(!stack.isEmpty() && nums2[i]>stack.peek()){
                map.put(stack.peek(),nums2[i]);
                stack.pop();
            }
            stack.push(nums2[i]);
        }
for(int i = 0;i<nums1.length;i++){
    if(map.containsKey(nums1[i])){
        arr[i] = map.get(nums1[i]);
    }
    else{
        arr[i] = -1;
    }
}
return arr;
    }
}