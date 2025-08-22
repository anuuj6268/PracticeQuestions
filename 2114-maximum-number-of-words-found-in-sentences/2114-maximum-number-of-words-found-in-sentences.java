class Solution {
    public int mostWordsFound(String[] sentences) {
        int previous = 0;
        for(String s: sentences){
            int count = 1;
            for(int i = 0;i<s.length()-1;i++){
                if(s.charAt(i)==' '){
                    count++;
                }
            }
            if(count>previous){
                previous = count;
            }
        }
    
    return previous;
    }
}