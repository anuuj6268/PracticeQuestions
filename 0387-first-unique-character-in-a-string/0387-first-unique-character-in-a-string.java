import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        char[] ch1 = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for(Character c : ch1){
            list.add(c);
        }
        LinkedHashSet<Character> set = new LinkedHashSet<>(list);
       
        for(Character c : set){
            int count = Collections.frequency(list,c);
            if(count==1){
                return list.indexOf(c);
            }
        }

return -1;

    }
}