class Solution {
    public String reverse(String S) {
   Stack<Character> stack = new Stack<>();
   int index = 0;
   while(index<S.length()){
       stack.push(S.charAt(index));
       index++;
   }
   
StringBuilder str = new StringBuilder("");
while(!stack.isEmpty()){
    char ch = stack.pop();
    str.append(ch);
}
   return str.toString();
   
    }
}