/*
 * Problem: LeetCode #392 - Is Subsequence
 * Approach: Two Pointers
 * Time Complexity: O(n), where n is the length of t
 * Space Complexity: O(1)
 *
 * Explanation:
 * Use two pointers to scan both strings from left to right.
 * If the characters match, move both pointers forward.
 * If they do not match, move only the pointer in t.
 * If the pointer in s reaches the end, every character
 * in s was found in the correct order, so return true.
 */
class Solution {
    public boolean isSubsequence(String s, String t) {

int i = 0;
int j = 0;

while (i < s.length() && j < t.length()) {
    if (s.charAt(i) == t.charAt(j)) {
        i++;
        j++;
    } else {
        j++;
    }
} if (i == s.length()){
    return true;
}
else return false;
    }
}
