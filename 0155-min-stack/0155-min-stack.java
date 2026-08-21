import java.util.ArrayDeque;
import java.util.Deque;

class MinStack {
    Deque<Integer> mainStack;
    Deque<Integer> minStack;



    public MinStack() {
        mainStack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }
    
    public void push(int value) {
        mainStack.push(value);
        if(!minStack.isEmpty() && value>minStack.peek()){
            minStack.push(minStack.peek());
        }
        else{
            minStack.push(value);
        }

    }
    
    public void pop() {
        mainStack.pop();
        minStack.pop();
    }
    
    public int top() {
       return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}