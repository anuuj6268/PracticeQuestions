import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        char[] ch = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for(Character c : ch){
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