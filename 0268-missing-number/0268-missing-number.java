class Solution {
    public int missingNumber(int[] numb) {
       Arrays.sort(numb); 
    for(int i = 0;i<numb.length;i++){
        if(numb[i]!=i)
        return i;
    }
    return numb.length;
    }
}