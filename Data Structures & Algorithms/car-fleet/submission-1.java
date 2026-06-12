class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] pair = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            pair[i] = new int[]{position[i], speed[i]};
        }

        Arrays.sort(pair, (a,b) -> Integer.compare(b[0], a[0]));
        Deque<Double> stack = new ArrayDeque<>();

        for(int[] p : pair){
            double curt = (double) (target - p[0]) / p[1];
            if (stack.isEmpty() || stack.peek() < curt){
                stack.push(curt);
            }
        }
        return stack.size();
    }
}
