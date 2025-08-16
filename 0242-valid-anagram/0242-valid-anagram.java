class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
        Arrays.sort(arrS);
        Arrays.sort(arrT);
        if(arrS.length != arrT.length){
           return false;
            }
            else{
                for(int i = 0;i<arrS.length;i++){
                if(arrS[i]!=arrT[i]){
                 return false;
                }
            }
        }
return true;
    }
}