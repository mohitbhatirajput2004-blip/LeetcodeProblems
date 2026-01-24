class MinStack {
    Stack<Integer> s;
    Stack<Integer> min;

    public MinStack() {
      s = new Stack<>();
       min = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(min.isEmpty() || val <= min.peek()){
            min.push(val);
        }

    }
    
    public void pop() {
      
      if(s.isEmpty()) return;
        int popped = s.pop();

        if(popped ==  min.peek()){
            min.pop();
        }

        }
    
    
    public int top() {
       int te = s.peek();
       return te;
    }
    
    public int getMin() {
        if(min.isEmpty()) return -1;
        int m = min.peek();
        return m;
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