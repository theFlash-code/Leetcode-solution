/*
 * @lc app=leetcode id=856 lang=java
 *
 * [856] Score of Parentheses
 */

// @lc code=start
class Solution {
    public int scoreOfParentheses(String s) {
        int depth = 0, res = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') {
                depth++;
            } else {
                depth--;
                if (s.charAt(i - 1) == '(') {
                    res += 1 << depth;
                }
            }
        }
        return res;
    }
}
// @lc code=end
