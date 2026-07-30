class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
       ArrayList<Integer> list = new ArrayList<>();
       int sum = 0;
       for(int i = 0;i<arr.length;i++){
           sum = sum+arr[i];
           list.add(sum);
       }
       
       return list;
    }
}