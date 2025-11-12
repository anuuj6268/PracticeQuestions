class Solution {
public static String[] wordList(String str1){
    return str1.split(" ");
}
public int lengthOfLastWord(String str1) {
String wordlist[] = wordList(str1);
String lastWords = wordlist[wordlist.length-1];
return lastWords.length();        
    }
}