// Java
class MyQueue {
    Stack<Integer> stack;

    public MyQueue() {
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) temp.push(stack.pop());
        int removed = temp.pop();
        while (!temp.isEmpty()) stack.push(temp.pop());
        return removed;
    }

    public int peek() {
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) temp.push(stack.pop());
        int peek = temp.peek();
        while (!temp.isEmpty()) stack.push(temp.pop());
        return peek;
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}