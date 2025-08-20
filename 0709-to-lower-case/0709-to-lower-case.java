class Solution {
    public String toLowerCase(String s) {
char[] ch = s.toCharArray();
for(int i = 0;i<ch.length;i++){
    if((int)ch[i]>=65 && (int)ch[i]<=90){
        int ascii = ch[i];
        ascii = ascii+32;
        ch[i] = (char)ascii;
    }
}
String str = new String(ch);
return str;
    }
}