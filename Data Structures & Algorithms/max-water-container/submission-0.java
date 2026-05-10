class Solution {
    public int maxArea(int[] heights) {
        int maxWater=0;
        int i=0;
        int j=heights.length-1;
        while(i<j){
            int curWater=(j-i) * Math.min(heights[i],heights[j]);
            maxWater= Math.max(maxWater,curWater);
            if(heights[i]<heights[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxWater;
    }
}
