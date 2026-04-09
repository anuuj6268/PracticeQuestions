class Solution {
public static String[] wordList(String str){
    return str.split(" ");
}
public int lengthOfLastWord(String strr) {
String wordlist[] = wordList(strr);
String lastWord = wordlist[wordlist.length-1];
return lastWord.length();        
    }
}