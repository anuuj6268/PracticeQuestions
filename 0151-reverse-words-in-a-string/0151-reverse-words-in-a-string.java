class Solution {
    public String reverseWords(String str) {
    str = str.trim();
    String words[] = str.split("\\s+");
    int left = 0;
    int right = words.length-1;
    while(left<right){
        String temp = words[left];
        words[left] = words[right];
        words[right] = temp;
        left++;
        right--;
    }
String ans = String.join(" ",words);

        return ans;
    }
}