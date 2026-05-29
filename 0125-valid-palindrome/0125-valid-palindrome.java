class Solution {
    public boolean isPalindrome(String str) {
        String results = str.replaceAll("[^a-zA-Z0-9]", "");
        String finalResult = results.replaceAll(" ","");
        String laster =   finalResult.toLowerCase();
        char[] arr = laster.toCharArray();
        int first = 0;
        int last = arr.length-1;
    while(first<last){
   if(arr[first]==arr[last]){
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