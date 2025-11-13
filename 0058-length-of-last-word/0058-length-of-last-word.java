class Solution {
public static String[] wordList(String str){
    return str.split(" ");
}
public int lengthOfLastWord(String str) {
String wordlist[] = wordList(str);
String lastWords = wordlist[wordlist.length-1];
return lastWords.length();        
    }
}