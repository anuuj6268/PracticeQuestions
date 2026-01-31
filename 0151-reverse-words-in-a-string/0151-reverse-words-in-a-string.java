class Solution {
    public String reverseWords(String s) {
    String[] strArray = s.split(" ");
    String ans = strArray[strArray.length-1];
    for(int i = strArray.length-2;i>=0;i--){
        ans = ans + " " + strArray[i];
    }

        }
    }
}