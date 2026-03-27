class Solution {
    public boolean isVowel(char ch){
        if(ch=='a' || ch=='A' || ch=='E' || ch=='e' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='U' || ch=='u'){
            return true;
        }
        return false;
    }


    public String reverseVowels(String s) {
        int i = 0;
        char[] ch = s.toCharArray();
        int j = ch.length-1;
        while(i<j){
            if(!isVowel(ch[i])){
             i++;
            }
            else if(!isVowel(ch[j])){
                j--;
            }
            else{
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
            }

}
String ans = new String(ch);

return ans;
    }
}