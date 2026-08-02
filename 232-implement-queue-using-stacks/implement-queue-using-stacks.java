class MyQueue {
    private Stack<Integer> ne, me;

    public MyQueue() {
        ne = new Stack<>();
        me = new Stack<>();
    }
    
    public void push(int x) {
        while(!ne.isEmpty()){
            me.push(ne.pop());
        }
        ne.push(x);
          while(!me.isEmpty()){
            ne.push(me.pop());
        }
    }
    
    public int pop() {
        return ne.pop();
        
    }
    
    public int peek() {
        return ne.peek();
        
    }
    
    public boolean empty() {
        return ne.isEmpty();
        
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