import java.util.Stack;

public class StackToQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack2.empty()&&stack1.empty()){
            throw new RuntimeException("Queue is Empty!");
        }
        if(stack2.empty()){
            while(!(stack1.empty())){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
