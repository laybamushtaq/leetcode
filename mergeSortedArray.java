/*
 * Approach: Two Pointers (Working Backwards)
 *
 * - Initialize three pointers:
 *   i = last actual element in nums1
 *   j = last element in nums2
 *   k = last available position in nums1
 *
 * - Compare the largest remaining elements in nums1 and nums2.
 * - Place the larger element at nums1[k].
 * - Decrement the pointer of the array the element came from.
 * - Decrement k after each placement.
 * - Continue until all elements from nums2 have been merged.
 *
 * - Working backwards prevents overwriting existing elements in nums1.
 *
 * Time Complexity: O(m + n)
 * Space Complexity: O(1)
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {

            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }return nums1;
    } 
}
