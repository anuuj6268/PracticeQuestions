class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
            HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
    for(int i = 0;i<k;i++){
        if(set.contains(s.charAt(i)))
        count++;
    }
int max = count;

for(int i = k;i<s.length();i++){
if(set.contains(s.charAt(i))){
    count++;
}
if(set.contains(s.charAt(i-k))){
    count--;
}
max = Math.max(max,count);
}

return max;
    }
}