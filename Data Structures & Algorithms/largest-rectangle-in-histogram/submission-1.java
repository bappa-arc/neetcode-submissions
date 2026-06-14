class Solution {
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) return 0;
        
        Deque<Integer> stack = new ArrayDeque<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++){
            int curh = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && heights[stack.peek()] > curh){
                int height = heights[stack.pop()];

                int weidth = stack.isEmpty() ? i : i - stack.peek() - 1;

                maxArea = Math.max(maxArea, height * weidth);
            }

            stack.push(i);
        }

        return maxArea;
    }
}
