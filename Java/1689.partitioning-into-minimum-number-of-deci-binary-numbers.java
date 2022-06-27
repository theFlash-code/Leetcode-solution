/*
 * @lc app=leetcode id=1689 lang=java
 *
 * [1689] Partitioning Into Minimum Number Of Deci-Binary Numbers
 */

// @lc code=start
class Solution {
    public int minPartitions(String n) {
        int max = 0;
        for (int i = 0; i < n.length(); ++i) {
            max = Math.max(max, n.charAt(i) - '0');
        }
        return max;
    }
}
// @lc code=end
