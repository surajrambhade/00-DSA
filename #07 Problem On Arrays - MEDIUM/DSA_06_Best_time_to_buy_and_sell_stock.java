//https://www.codingninjas.com/studio/problems/best-time-to-buy-and-sell-stock_6194560?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class DSA_06_Best_time_to_buy_and_sell_stock {

  public static int bestTimeToBuyAndSellStock(int[] prices) {

    int mini = prices[0];
    int maxProfit = 0;
    int n = prices.length;

    for (int i = 1; i < n; i++) {
      // Calculate the profit if stock is sold on the current day
      // after buying at the minimum price
      int cost = prices[i] - mini;

      // Update maxProfit with the maximum of current profit and previous maxProfit
      maxProfit = Math.max(maxProfit, cost);

      // Update the minimum stock price with the minimum of current price and previous
      // minimum
      mini = Math.min(mini, prices[i]);
    }

    // Return the maximum profit
    return maxProfit;
  }

  public static void main(String[] args) {
    // Example usage:
    int[] prices = { 7, 1, 5, 3, 6, 4 }; // Sample stock prices
    int result = bestTimeToBuyAndSellStock(prices);
    System.out.println("Maximum Profit: " + result);
  }
}