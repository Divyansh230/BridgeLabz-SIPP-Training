package Stack_And_Queue;

import java.util.Stack;

public class StackSorting {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(4);
        stack.push(5);
        stack.push(0);
        stack.push(6);
        sort(stack);
        System.out.println(stack);
    }
   static void sort(Stack<Integer> stack) {
        if(stack.isEmpty())return;
        int top = stack.peek();
        stack.pop();
        sort(stack);
        insert(stack,top);

    }
    static void insert(Stack<Integer> stack, int top) {
        if(stack.isEmpty()||top>stack.peek()){
            stack.push(top);
            return;
        }
        int tx=stack.pop();
        insert(stack,top);
        stack.push(tx);
    }
}
