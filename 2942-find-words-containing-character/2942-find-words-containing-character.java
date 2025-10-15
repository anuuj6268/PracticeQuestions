class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> list = new ArrayList<>();
int index = 0;

for(String s : words){
char[] ch = s.toCharArray();
for(int i = 0;i<s.length();i++){
    if(s.charAt(i)==x){
        list.add(index);
        break;
    }
}
index++;
}

return list;
    }
}