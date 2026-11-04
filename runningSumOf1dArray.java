
/*
 * Problem: LeetCode #1480 - Running Sum of 1D Array
 * Approach: Prefix Sum / Running Total
 * Time Complexity: O(n) - Traverse the array once.
 * Space Complexity: O(n) - Create an output array of size n.
 *
 * Explanation:
 * Initialize a running total at 0.
 * Iterate through the input array and add each element
 * to the running total.
 * Store the updated running total at the corresponding
 * index in the output array.
 * Return the resulting array.
 */

class Solution {
    public int[] runningSum(int[] nums) {
    int runningSum[] = new int[nums.length];
    int currentSum =0;
   
    for (int i = 0; i < nums.length; i++) {
    currentSum = currentSum + nums[i];
    runningSum[i] = currentSum;

}    return runningSum;
    }
}
