class Solution {
    public boolean isAnagram(String s, String t) {
        TreeMap<Character,Integer> map = new TreeMap<>();
        TreeMap<Character,Integer> map2 = new TreeMap<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        for(int i = 0;i<t.length();i++){
            char ch = t.charAt(i);
            if(map2.containsKey(ch)){
                map2.put(ch,map2.get(ch)+1);
            }
            else{
                map2.put(ch,1);
            }
        }
        if(map.equals(map2)){
            return true;
        }
        return false;
    }
}