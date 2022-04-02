/*
 * @lc app=leetcode id=1249 lang=java
 *
 * [1249] Minimum Remove to Make Valid Parentheses
 */

// @lc code=start
class Solution {
    public String minRemoveToMakeValid(String s) {
        int st = 0;
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); ++i) {
            if (sb.charAt(i) == '(') {
                st++;
            } else if (sb.charAt(i) == ')') {
                if (st <= 0) {
                    sb.deleteCharAt(i);
                    i--;
                } else {
                    st--;
                }
            }
        }
        int i = sb.length() - 1;
        while (st > 0 && i >= 0) {
            if (sb.charAt(i) == '(') {
                st--;
                sb.deleteCharAt(i);
            }
            i--;
        }
        return sb.toString();
    }
}
// @lc code=end
