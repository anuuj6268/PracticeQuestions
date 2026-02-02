class Solution {
public static String[] wordList(String str){
    return str.split(" ");
}
public int lengthOfLastWord(String str) {
String wordlist[] = wordList(str);
String lastWord = wordlist[wordlist.length-1];
return lastWord.length();        
    }
}