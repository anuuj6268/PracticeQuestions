class Solution {
    public boolean isPalindrome(String str) {
        String result = str.replaceAll("[^a-zA-Z0-9]", "");
        String finalResult = result.replaceAll(" ","");
        String laster =   finalResult.toLowerCase();
        char[] arr = laster.toCharArray();
        int first = 0;
        int lastest = arr.length-1;
    while(first<lastest){
   if(arr[first]==arr[lastest]){
    lastest--;
    first++;
   }  
   else{
    return false;
   }
}
return true;
    }
}