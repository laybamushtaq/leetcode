import java.util.HashMap;
import java.util.Map;

/*
 * Problem: Two Sum (LeetCode #1)
 * Approach: HashMap
 * Time Complexity: O(n) average
 * Space Complexity: O(n)
 *
 * Calculate the complement of each number and check whether
 * it has already been encountered using a HashMap.
 * If found, return both indices. Otherwise, store the
 * current number and its index.
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
