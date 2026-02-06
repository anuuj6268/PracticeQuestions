class Solution {
    public String reverseWords(String s) {
    s = s.trim();
    String words[] = s.split("\\s+");
    int lefte = 0;
    int right = words.length-1;
    while(lefte<right){
        String temp = words[lefte];
        words[lefte] = words[right];
        words[right] = temp;
        lefte++;
        right--;
    }
String ans = String.join(" ",words);

        return ans;
    }
}