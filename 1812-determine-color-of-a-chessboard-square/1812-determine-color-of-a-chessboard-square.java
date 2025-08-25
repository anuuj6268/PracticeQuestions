class Solution {
    public boolean squareIsWhite(String coordinates) {
      char[] ch = coordinates.toCharArray();
      int first = (int)ch[0];
      int second = (int)ch[1];
      int sum = first+second;
      if(sum%2==0){
        return false;
      }
return true;
    }
}