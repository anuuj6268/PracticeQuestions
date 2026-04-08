class Solution {
    public int singleNumber(int[] num) {
        Arrays.sort(num);
        for(int i = 0;i<num.length-1;i+=2){
            if(num[i]!=num[i+1]){
                return num[i];
            }
        }
return num[num.length-1];
}
}