class MinStack {
    private Stack<int[]> mstack;
    public MinStack() {
        mstack = new Stack<>();
    }
    
    public void push(int val) {
        if (mstack.empty()){
            mstack.push(new int[]{val, val});
        }else{
            int curmin = Math.min(val, mstack.peek()[1]);
            mstack.push(new int[]{val, curmin});
        }
    }
    
    public void pop() {
        if (!mstack.empty()){
            mstack.pop();
        }
    }
    
    public int top() {
        return mstack.peek()[0];
    }
    
    public int getMin() {
        return mstack.peek()[1];
    }
}
