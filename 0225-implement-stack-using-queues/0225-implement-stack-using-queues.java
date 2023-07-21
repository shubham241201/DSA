class MyStack {
    private Queue<Integer> first;
    private Queue<Integer> second;
    private int top;

    public MyStack() {
        first = new LinkedList<>();
        second = new LinkedList<>();
    }
    
    public void push(int x) {
        first.add(x);
        top = x;
    }
    
    public int pop() {
        while(first.size() > 1){
            top = first.remove();
            second.add(top);
        }
        int oh = first.remove();
        Queue<Integer> temp = first;
        first = second;
        second = temp;        
        return oh;
    }
    
    public int top() {
        return top;
    }
    
    public boolean empty() {
        return first.isEmpty();
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