import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
                List<Integer> list = new ArrayList<>();
        if(p.length()>s.length()) return list;


        int[] sFreq = new int[26];
        int[] pFreq = new int[26];
        for(int i = 0;i<p.length();i++){
            pFreq[p.charAt(i)-'a']++;
            sFreq[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(sFreq, pFreq)){
            list.add(0);
        }

        for(int i = p.length();i<s.length();i++){
            sFreq[s.charAt(i)-'a']++;
            sFreq[s.charAt(i-p.length())-'a']--;

            if(Arrays.equals(sFreq, pFreq)){
                list.add(i-p.length()+1);
            }
        }


return list;
    }
}