class Solution {
    public int[] sortArrayByParityII(int[] numss) {
        int[] arr = new int[numss.length];
        int evenIndex = 0;
        int oddIndex = 1;
    for(int i = 0;i<numss.length;i++){
        if(numss[i]%2==0){
            arr[evenIndex] = numss[i];
            evenIndex +=2;
        }
    }

    for(int i = 0;i<numss.length;i++){
        if(numss[i]%2!=0){
            arr[oddIndex] = numss[i];
            oddIndex +=2;
        }
    }
return arr;
    }
}