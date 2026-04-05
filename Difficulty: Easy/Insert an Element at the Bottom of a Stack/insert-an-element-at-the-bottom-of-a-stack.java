// User function Template for Java
class Solution {
    public void pushAtBottom(Stack<Integer> st,int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top = st.pop();
        pushAtBottom(st,data);
        st.push(top);
    }
    
    
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        
pushAtBottom(st,x);
return st;
        
    }
}