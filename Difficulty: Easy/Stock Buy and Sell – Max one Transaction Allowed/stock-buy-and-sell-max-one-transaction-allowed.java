// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for(int price : prices){
            if(price < buyPrice){
                
               buyPrice = price;
            }
            else{
                maxProfit = Math.max(maxProfit,price-buyPrice);
            }
        }
        return maxProfit;
    }
}