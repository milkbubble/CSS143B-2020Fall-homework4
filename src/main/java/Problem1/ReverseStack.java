package Problem1;

import java.util.Stack;

public class ReverseStack {
    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty() == false) {
            int n = stack.peek();
            stack.pop();
            reverseStack(stack);
            insertAtEnd(stack, n);
        }
    }
    public static void insertAtEnd(Stack<Integer> stack, int x) {
        if(stack.isEmpty()) {
            stack.push(x);
            return;
        }
        int a = stack.peek();
        stack.pop();
        insertAtEnd(stack, x);
        stack.push(a);
    }
}