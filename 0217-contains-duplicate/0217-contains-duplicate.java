class Solution {
    public boolean containsDuplicate(int[] number) {
Arrays.sort(number);
for(int i = 0;i<number.length-1;i++){
   if(number[i]==number[i+1]){
    return true;
   }
}
return false;    
    }
}