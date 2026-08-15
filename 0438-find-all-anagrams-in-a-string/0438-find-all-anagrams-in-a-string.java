class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if(p.length()>s.length()) return list;

        int[] sF = new int[26];
        int[] pF = new int[26];
        for(int i = 0;i<p.length();i++){
            pF[p.charAt(i)-'a']++;
            sF[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(pF,sF)){
            list.add(0);
        }

        for(int i = p.length();i<s.length();i++){
            sF[s.charAt(i)-'a']++;
            sF[s.charAt(i-p.length())-'a']--;
            if(Arrays.equals(sF,pF)){
                list.add(i-p.length()+1);
            }
        }


return list;
    }
}