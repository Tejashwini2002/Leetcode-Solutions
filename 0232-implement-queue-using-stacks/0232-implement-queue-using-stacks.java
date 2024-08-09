class MyQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public MyQueue() {
       
    }
    
    public void push(int x) {
        while (!s1.isEmpty()) { // until s1 becomes empty
            s2.push(s1.pop()); // popping from s1 and pushing into s2.
        }
        // once s1 becomes empty, push new data into it.
        s1.push(x);
        // Next, until s2 becomes empty pop elements from s2 and go on pushing in s1.
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }
    
    public int pop() {
        if (s1.isEmpty()) {
            //System.out.println("Empty queue");
            return -1;
        }
        // The topmost element of stack s1 is our front element of the queue.
         return s1.pop();
    }
    
    public int peek() {
        if(s1.isEmpty()) {
            //System.out.println("Empty queue");
            return -1;
        }
        // The topmost element of stack s1 is our front element of the queue.
        return s1.peek();    
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */