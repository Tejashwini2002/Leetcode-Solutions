class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val ;
            next = null;
        }
}
class MinStack {
    public Node head;
    private Deque<Integer> minValuesStack = new ArrayDeque<>();
    public  boolean isEmpty(){
        return head == null;
    }
    public MinStack() {
        minValuesStack.addLast(Integer.MAX_VALUE);
    }
    public void push(int val) {
        Node newNode = new Node(val);
        if(isEmpty()){
            head = newNode;
            int value = Math.min(val, minValuesStack.getLast());
            minValuesStack.addLast(value);
            return;
        }
        newNode.next = head;
        head = newNode;
        int value = Math.min(val, minValuesStack.getLast());
        minValuesStack.addLast(value);   
    }
    public void pop() {
        if(isEmpty()){

        }
        Node temp = head;     // Store current head
        head = head.next;     // Update head to the next node
        temp.next = null; 
        minValuesStack.removeLast(); 
    }
    public int top() {
        if(isEmpty()){
          
        }
        return head.val;
    }
    public int getMin() {
        return minValuesStack.peekLast();
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */