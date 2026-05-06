class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for(int num : nums){
            s.add(num);
        }
        int maxCount=0;
        for(int num:s){
            if(!s.contains(num-1)){
                int currentNum = num;
                int currentCount = 1;
                while(s.contains(currentNum+1)){
                    currentNum++;
                    currentCount++;
                }
                maxCount = Math.max(maxCount, currentCount);
            }
        }
        return maxCount;
    }
}
