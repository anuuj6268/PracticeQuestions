class Solution {
    
    public static void pushAtBottom(Stack<Integer> st,int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top = st.pop();
        pushAtBottom(st,data);
        st.push(top);
    }
    
    
    
    public static void reverseStack(Stack<Integer> st) {
    
    while(st.isEmpty()){
        return;
    }
    int top = st.pop();
    reverseStack(st);
    pushAtBottom(st,top);
    }
}
