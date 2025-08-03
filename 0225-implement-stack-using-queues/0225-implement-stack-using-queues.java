import java.util.LinkedList;

class MyStack {

    Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }
    
    public void push(int x) {
        
        //first time push 
        //or other than it

        if(queue.size() == 0)
        {
            queue.add(x);
        }
        else 
        {
            Queue<Integer> dummpyQueue = new LinkedList<>();
            while(queue.size() > 0)
            {
                int popElement = queue.remove();
                dummpyQueue.add(popElement);
            }
            queue.add(x);

            while(dummpyQueue.size() > 0)
            {
                int elementInsert = dummpyQueue.remove();
                queue.add(elementInsert);
            }
        }
    }
    
    public int pop() {
        int popElement = queue.remove();
        return popElement;
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return ((queue.size()==0)? true : false);
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */