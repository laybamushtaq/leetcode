class Solution {
    public int singleNumber(int[] nums) {
        // Initialize a HashSet to store numbers that appear an odd number of times
        Set<Integer> seen = new HashSet<>();

        // Iterate through every number in the array
        for (int i = 0; i < nums.length; i++) {

            // If the number is already in the set, remove it (second occurrence)
            if (seen.contains(nums[i])) {
                seen.remove(nums[i]);
            } else {
                // Otherwise, add the number to the set (first occurrence)
                seen.add(nums[i]);
            }
        }

        // Only the number appearing once remains in the set
        // Return that number as an int
        return seen.iterator().next();
    }
}