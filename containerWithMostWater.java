/*
 * Problem: LeetCode #11 - Container With Most Water
 * Approach: Two Pointers / Greedy
 * Time Complexity: O(n) - Each pointer moves through the array once.
 * Space Complexity: O(1) - Uses only a constant number of variables.
 *
 * Explanation:
 * Initialize two pointers at opposite ends of the array.
 * Calculate the area using the shorter of the two heights
 * multiplied by the distance between the pointers.
 * Update maxArea whenever a larger area is found.
 * Move the pointer at the shorter height inward because
 * the shorter height limits the amount of water held.
 * Continue until the pointers meet.
 * Return the maximum area found.
 */
class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right){
            int area = Math.min(height[left], height[right]) * (right - left);
            if (height[left]>height[right]){
                right--;
                
            } else left ++;
            if (area > maxArea){
                maxArea = area;
            }
        } 

    return maxArea;
    }
}
