class Solution {
public static String[] wordList(String str){
    return str.split(" ");
}
public int lengthOfLastWord(String s) {
String wordlist[] = wordList(s);
String lastWord = wordlist[wordlist.length-1];
return lastWord.length();        
    }
}