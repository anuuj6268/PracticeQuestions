import java.util.*;
class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean flag = true;
        char[] ch = sentence.toCharArray();
        TreeSet<Character> set = new TreeSet<>();
        for(Character c : ch){
            set.add(c);
        }
        if(set.size()==26){
            flag = true;
        }
        else{
            flag = false;
        }
        return flag;
    }
}