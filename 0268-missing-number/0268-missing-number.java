class Solution {
    public int missingNumber(int[] num) {
       Arrays.sort(num); 
    for(int i = 0;i<num.length;i++){
        if(num[i]!=i)
        return i;
    }
    return num.length;
    }
}