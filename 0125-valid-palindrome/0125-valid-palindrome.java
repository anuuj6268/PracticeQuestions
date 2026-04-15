class Solution {
    public boolean isPalindrome(String str) {
        String result = str.replaceAll("[^a-zA-Z0-9]", "");
        String finalResult = result.replaceAll(" ","");
        String laster =   finalResult.toLowerCase();
        char[] arrA = laster.toCharArray();
        int first = 0;
        int last = arrA.length-1;
    while(first<last){
   if(arrA[first]==arrA[last]){
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