/*
 * Problem: LeetCode #121 - Best Time to Buy and Sell Stock
 * Approach: One Pass / Greedy
 * Time Complexity: O(n) - Traverse the array once.
 * Space Complexity: O(1) - Use only a few variables.
 *
 * Explanation:
 * Track the lowest stock price encountered so far.
 * Calculate the potential profit at each day by subtracting
 * the minimum price from the current price.
 * Update the maximum profit whenever a larger profit is found.
 * Return the highest profit, or 0 if no profit is possible.
 */
class Solution {
    public int maxProfit(int[] prices) {

    int minPrice = prices[0];
    int profit = 0;
    int minAt = 0;
    int maxProfit = 0;

    for (int i =0; i < prices.length; i++){
        if (minPrice >= prices[i] || prices[i] == 0){
            minPrice = prices[i];
            minAt = i;
           
        }
        profit = prices[i] - minPrice;
        if (profit > maxProfit){
        maxProfit = profit;
        }
        }
    return maxProfit;
    } 
}
