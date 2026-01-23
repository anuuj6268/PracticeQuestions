import java.util.Arrays;

class Solution {
    public int maximumGap(int[] num) {
        Arrays.sort(num);
        int number = 0; 
        int j = 0;
    for(int i = 0;i<num.length-1;i++){
     j = num[i+1]-num[i];
if(number<j){
    number = j;
}
    }
if(num.length==1){
    return 0;
}
return number;
    }
}