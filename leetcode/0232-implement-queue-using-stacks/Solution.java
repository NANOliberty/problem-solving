class MyQueue {
    private Deque<Integer> inQueue;
    private Deque<Integer> outQueue;

    public MyQueue() {
        inQueue = new ArrayDeque<>();
        outQueue = new ArrayDeque<>();
    }
    
    public void push(int x) {
        inQueue.push(x);
    }
    
    public int pop() {
        if (outQueue.isEmpty()) {
            while(!inQueue.isEmpty()) outQueue.push(inQueue.pop());

        }
        return outQueue.pop();
        
    }
    
    public int peek() {
        if (outQueue.isEmpty()) {
            while(!inQueue.isEmpty()) outQueue.push(inQueue.pop());

        }        
        return outQueue.peek();
        
    }
    
    public boolean empty() {
        return inQueue.isEmpty() && outQueue.isEmpty();
    }
}

/*
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */