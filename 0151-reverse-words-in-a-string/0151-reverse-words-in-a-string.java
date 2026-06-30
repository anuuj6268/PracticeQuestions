class Solution {
    public String reverseWords(String s) {
     StringBuilder str = new StringBuilder();
        int i = s.length()-1;
        while(i>=0){
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            if(i<0) break;
            int j = i;
            while(j>=0 && s.charAt(j)!=' '){
                j--;
            }

            if(str.length()>0) str.append(" ");

            str.append(s.substring(j+1,i+1));
            i=j;
        }
        
return str.toString();
    }
}