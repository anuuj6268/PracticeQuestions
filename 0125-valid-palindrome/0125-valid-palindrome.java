class Solution {
    public boolean isPalindrome(String str) {
        String result = str.replaceAll("[^a-zA-Z0-9]", "");
        String finalResult = result.replaceAll(" ","");
        String laster =   finalResult.toLowerCase();
        char[] arry = laster.toCharArray();
        int first = 0;
        int last = arry.length-1;
    while(first<last){
   if(arry[first]==arry[last]){
    last--;
    first++;
   }  
   else{
    return false;
   }
}
return true;
    }
}