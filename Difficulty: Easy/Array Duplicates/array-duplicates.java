class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        int left = 0;
        int right = 1;
        while(right<arr.length){
            if(arr[left]==arr[right]){
                list.add(arr[left]);
            }
            left++;
            right++;
        }
        return list;
    }
}