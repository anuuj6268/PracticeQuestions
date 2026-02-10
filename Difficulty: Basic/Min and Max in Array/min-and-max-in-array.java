class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
    ArrayList<Integer> list = new ArrayList<>();
    int min = arr[0];
    int max = arr[0];
    for(int i = 0;i<arr.length;i++){
        if(min>arr[i]){
            min = arr[i];
        }
        else if(max<arr[i]){
            max = arr[i];
        }
    }
    list.add(min);
    list.add(max);
    return list;
    
    
    }
}
