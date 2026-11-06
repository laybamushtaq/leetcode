
/*
 * Problem: LeetCode #15 - 3Sum
 * Approach: Sorting + Two Pointers
 * Time Complexity: O(n^2) - Sorting takes O(n log n),
 *                  and the nested two-pointer search takes O(n^2).
 * Space Complexity: O(1) auxiliary space, excluding the output
 *                   and the space used internally by sorting.
 *
 * Explanation:
 * Sort the input array to make it easier to find triplets
 * and avoid duplicate combinations.
 *
 * Iterate through the array, treating each element as the
 * first number in a potential triplet.
 *
 * Use two pointers, left and right, to find two additional
 * numbers that make the total sum equal to zero.
 *
 * If the sum is positive, move the right pointer left.
 * If the sum is negative, move the left pointer right.
 * If the sum is zero, add the triplet to the output and
 * move both pointers inward.
 *
 * Skip duplicate values to ensure each triplet is unique.
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
    List<List<Integer>> output = new ArrayList<>();
    int sum = 0;

    for (int i = 0; i < nums.length; i++) {
        if (i > 0 && nums[i] == nums[i - 1]) {
    continue;
}

    int left = i + 1;
    int right = nums.length - 1;

    while (left < right) {

        sum = nums[i] + nums[left] + nums[right];
        if (sum > 0){
            right--;
        }
        else if (sum<0){
            left++;
        }
       else {
    output.add(Arrays.asList(nums[i], nums[left], nums[right]));

    left++;
    right--;

    while (left < right && nums[left] == nums[left - 1]) {
        left++;
    }

    while (left < right && nums[right] == nums[right + 1]) {
        right--;
    }
}

    }
} return output;
   
    }
}
