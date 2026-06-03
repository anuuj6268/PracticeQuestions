class Solution {
public static String[] wordList(String strr){
    return strr.split(" ");
}
public int lengthOfLastWord(String strr) {
String wordlist[] = wordList(strr);
String lastWords = wordlist[wordlist.length-1];
return lastWords.length();        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna