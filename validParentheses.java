/*
 * Problem: Valid Parentheses (LeetCode #20)
 * Pattern: Stack
 *
 * Approach:
 * - Use a Stack to keep track of opening brackets.
 * - Push opening brackets (, [, { onto the stack.
 * - When encountering a closing bracket, check if the stack is empty.
 * - Pop the top element and verify that it matches the closing bracket.
 * - If the brackets do not match, return false.
 * - After iterating through the string, return true only if the stack is empty.
 *
 * Time Complexity: O(n) - Traverse the string once.
 * Space Complexity: O(n) - Stack can store up to n/2 opening brackets.
 */
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '[') {
                stack.push('[');
            }
            if (s.charAt(i) == '(') {
                stack.push('(');
            }
            if (s.charAt(i) == '{') {
                stack.push('{');
            }

           if (s.charAt(i) == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
            return false;
            }   
        }
        if (s.charAt(i) == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
            return false;
            }   
        }
        if (s.charAt(i) == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
            return false;
            }   
        }
        }
        return stack.isEmpty();
    }
}
