
/*
 * Problem: LeetCode #53 - Maximum Subarray
 * Approach: Kadane's Algorithm / Dynamic Programming
 * Time Complexity: O(n) - Traverse the array once.
 * Space Complexity: O(1) - Use only two variables.
 *
 * Explanation:
 * Track the maximum sum of a subarray ending at the current index.
 * At each element, decide whether to start a new subarray
 * or extend the previous subarray.
 * Update maxSum whenever a larger sum is found.
 */

class Solution {
    public int maxSubArray(int[] nums) {

        int maxSum = nums[0]; // Largest subarray sum found
        int sum = nums[0]; // Current subarray sum

        // Start at index 1 because index 0 initializes both variables
        for (int i = 1; i < nums.length; i++) {

            // Start a new subarray or extend the current one
            sum = Math.max(nums[i], sum + nums[i]);

            // Update the maximum sum if necessary
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }
}
