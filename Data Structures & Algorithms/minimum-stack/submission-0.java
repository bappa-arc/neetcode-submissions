class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> mstack;
    public MinStack() {
        stack = new Stack<>();
        mstack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);

        if (mstack.empty() || val <= mstack.peek()){
            mstack.push(val);
        }
    }
    
    public void pop() {
        if (!stack.empty()){
            if (stack.peek().equals(mstack.peek())){
                mstack.pop();
            }
            stack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return mstack.peek();
    }
}
