class Solution {
    public String reverseWords(String s) {
        s = s.replaceAll("\\s+"," ").trim();
        String[] str = s.split(" ");
        int left = 0;
        int right = str.length-1;
        while(left<right){
            String temp = "";
            temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
        return String.join(" ",str);    
        }
}