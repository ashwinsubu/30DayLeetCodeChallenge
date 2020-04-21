class BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        int prev = 0;
        int sumProfit=0;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(i+1 < prices.length && prices[i+1] > prices[i]){
                continue;
            }
            
            profit = i >0 ? prices[i] - prices[prev] : 0;
            prev = i+1;
            sumProfit += profit;
            
        }
        return sumProfit;
    }
}