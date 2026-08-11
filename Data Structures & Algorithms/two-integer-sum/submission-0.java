class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sol = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (sol.containsKey(complement)) {
                result[0] = sol.get(complement);
                result[1] = i;
            }
            sol.put(nums[i], i);
        }
        return result;
    }
}
