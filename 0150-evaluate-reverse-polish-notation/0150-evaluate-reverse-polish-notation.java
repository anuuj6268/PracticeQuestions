class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int a = stack.peek();
                stack.pop();
                int b = stack.peek();
                stack.pop();
                int result = a + b;
                stack.push(result);
            }
            else if(tokens[i].equals("-")){
                int a = stack.peek();
                stack.pop();
                int b = stack.peek();
                stack.pop();
                int result = b - a;
                stack.push(result);
            }
            else if(tokens[i].equals("*")){
                int a = stack.peek();
                stack.pop();
                int b = stack.peek();
                stack.pop();
                int result = a * b;
                stack.push(result);
            }
            else if(tokens[i].equals("/")){
                int a = stack.peek();
                stack.pop();
                int b = stack.peek();
                stack.pop();
                int result = b/a;
                stack.push(result);
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();
    }
}