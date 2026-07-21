class Solution {
    public int maxProfit(int[] prices) {
        int maxpro = 0;
        int minPri = Integer.MAX_VALUE;

        for(int i =0;i<prices.length;i++){
            
                minPri = Math.min(minPri,prices[i]);
                maxpro = Math.max(maxpro,prices[i] - minPri);
            
        }
        return maxpro;
    }
}
