class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
 ArrayList<Integer> list = new ArrayList<>();
 int n = arr.length;
 int max = arr[arr.length-1];
 list.add(max);
 
 for(int i = n-2;i>=0;i--){
     if(arr[i]>=max){
         max = arr[i];
         list.add(max);
     }
     
 }
 Collections.reverse(list);
 return list;
 
    }
}
