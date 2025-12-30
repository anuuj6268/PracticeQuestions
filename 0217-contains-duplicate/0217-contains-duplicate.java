class Solution {
    public boolean containsDuplicate(int[] numb) {
Arrays.sort(numb);
for(int i = 0;i<numb.length-1;i++){
   if(numb[i]==numb[i+1]){
    return true;
   }
}
return false;    
    }
}