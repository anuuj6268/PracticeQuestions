import java.util.Deque;

class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.isEmpty()) return false;
                
                if((s.charAt(i)==')' && stack.peek()=='(') || (stack.peek() =='[' && s.charAt(i) ==']') || (stack.peek() =='{' && s.charAt(i)=='}')){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
return stack.isEmpty();
    }
}