class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        StringBuilder sb  = new StringBuilder();
        String ans = "";
        int index = 0;
        while(index<str.length()){
            for(int i = 1;i<strs.length;i++){
                if(index == strs[i].length()) return ans;
                if(str.charAt(index)!=strs[i].charAt(index)){
                return ans;
                }
            }
            sb = sb.append(str.charAt(index));
            index++;
        ans = sb.toString();

        }
        return ans;
    }
}