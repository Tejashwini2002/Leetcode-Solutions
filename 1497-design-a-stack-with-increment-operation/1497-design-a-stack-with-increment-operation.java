class CustomStack {
    private int[] arr;
    private int top = -1;
    public CustomStack(int maxSize) {
        arr = new int[maxSize];
    }
    
    public void push(int x) {
        if(top == arr.length-1){

        }else{
            arr[++top] =x;
        }
    }
    
    public int pop() {
        if(top == -1){
            return -1;
        }
        int val = arr[top];
        top--;
        return val;
    }
    
    public void increment(int k, int val) {
        if(k>top){
            for(int i = 0;i<=top;i++){
                arr[i] = arr[i]+val;
            }   
        }else{
            for(int i = 0;i<k;i++){
                arr[i] = arr[i]+val;
            } 
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */