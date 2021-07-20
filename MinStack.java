import java.util.Stack;

public class MinStack {
    Stack<Integer> normal = new Stack<>();
    Stack<Integer> minS = new Stack<>();
    public void push(int node) {
        normal.push(node);
        if (minS.isEmpty()){
            minS.push(node);
        }else{
            if (node<=minS.peek()){
                minS.push(node);
            }else{
                minS.push(minS.peek());
            }
        }
    }

    public void pop() {
        normal.pop();
        minS.pop();
    }

    public int top() {
        return normal.peek();
    }

    public int min() {
       return minS.peek();
    }
}
