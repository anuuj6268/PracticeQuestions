class Solution {
public static String[] wordList(String stre){
    return stre.split(" ");
}
public int lengthOfLastWord(String stre) {
String wordlist[] = wordList(stre);
String lastWord = wordlist[wordlist.length-1];
return lastWord.length();        
    }
}