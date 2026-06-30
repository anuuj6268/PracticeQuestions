class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        String ans = "";
        int index = 0;
        while(index<str.length()){
            for(int i = 1;i<strs.length;i++){
                if(index == strs[i].length()) return ans;
                if(str.charAt(index)!=strs[i].charAt(index)){
                return ans;
                }
            }
            ans = ans + str.charAt(index);
            index++;
        }

return ans;
    }
}