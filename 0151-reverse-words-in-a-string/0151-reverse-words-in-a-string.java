class Solution {
    public String reverseWords(String s) {
    s = s.trim();
    String words[] = s.split("\\s+");
    String ans = "";
        for(int i = words.length-1;i>=0;i--){
            if(i==0){
                if(words[i]!=" "){
                ans = ans+words[i];
                }
            }
            else{
                ans = ans + words[i]+ " ";
            }
        }


        return ans;
    }
}