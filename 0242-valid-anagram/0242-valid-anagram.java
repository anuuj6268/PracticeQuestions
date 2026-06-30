class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(int i = 0;i<s.length();i++){
            int count = 1;
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),count);
            }
            else{
                count = map.get(s.charAt(i));
                map.put(s.charAt(i),count+1);
            }
        }
        for(int i = 0;i<t.length();i++){
    if (!map.containsKey(t.charAt(i))) {
        return false;
    }
           int count = map.get(t.charAt(i))-1;
           if(count==0){
            map.remove(t.charAt(i));
           }
            else{
                map.put(t.charAt(i),count);
            }

        }
if(map.isEmpty()){
    return true;
}
return false;
    }
}