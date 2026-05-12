class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length<2) return 0;
        int minPrices = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if (minPrices>prices[i]){
                minPrices=prices[i];
            }else if(prices[i]-minPrices>maxProfit){
                maxProfit=prices[i]-minPrices;
            }
        }
        return maxProfit;
    }
}
