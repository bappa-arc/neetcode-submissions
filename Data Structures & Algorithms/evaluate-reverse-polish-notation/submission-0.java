class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int a, b;
        for ( int i=0; i<tokens.length; i++){
            if (!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")){
                stack.push(Integer.parseInt(tokens[i]));
            }else{
                switch (tokens[i]){
                    case "+":
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(b+a);
                        break;
                    case "-":
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(b-a);
                        break;
                    case "*":
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(b*a);
                        break;
                    case "/":
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(b/a);
                        break;
                }
            }
        }
        return stack.peek();
    }
}
