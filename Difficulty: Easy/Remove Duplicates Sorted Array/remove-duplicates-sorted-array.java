class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
ArrayList<Integer> list = new ArrayList<>();
int uniqueElement = 1;
list.add(arr[0]);
for(int i = 1;i<arr.length;i++){
    if(arr[i]!=arr[i-1]){
        list.add(arr[i]);
        uniqueElement++;
    }
}

return list;
    }
}
