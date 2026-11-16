
class Solution {
    public int missingNumber(int[] nums) {

        // Initialize variable to store the missing number
        int missing = 0;

        // Create a boolean array to track which numbers have been seen
        // Size is nums.length + 1 because numbers range from 0 to n
        boolean[] m = new boolean[nums.length + 1];

        // First loop: Mark each number in nums as true in the boolean array
        for (int i = 0; i < nums.length; i++) {
            m[nums[i]] = true;
        }

        // Second loop: Find the index that was never marked as true
        for (int j = 0; j < nums.length + 1; j++) {
            if (m[j] == false) {
                missing = j;
            }
        }

        // Return the missing number
        return missing;
    }
}
