/*
 * @lc app=leetcode id=338 lang=java
 *
 * [338] Counting Bits
 */

// @lc code=start
class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 0; i <= n; ++i) {
            dp[i] = dp[i / 2];
            if (i % 2 == 1)
                dp[i]++;
        }
        return dp;
    }
}
// @lc code=end
