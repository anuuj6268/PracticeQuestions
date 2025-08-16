class Solution {
    public int maximum69Number (int num) {
String s = String.valueOf(num);
char[] chArr = s.toCharArray();
for(int i=0; i<chArr.length; i++){
    if(chArr[i]!='9'){
        chArr[i]='9';
        break;
    }
}
String str = new String(chArr);
int nums = Integer.parseInt(str);
return nums;


}
}