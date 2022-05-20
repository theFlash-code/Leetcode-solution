/*
 * @lc app=leetcode id=63 lang=java
 *
 * [63] Unique Paths II
 */

// @lc code=start
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1)
            return 0;
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        dp[0][0] = 1;
        for (int i = 0; i < dp.length; ++i) {
            for (int j = 0; j < dp[0].length; ++j) {
                if (obstacleGrid[i][j] == 1 || (i == 0 && j == 0))
                    continue;
                int left = 0, up = 0;
                if (i - 1 >= 0)
                    left = dp[i - 1][j];
                if (j - 1 >= 0)
                    up = dp[i][j - 1];
                dp[i][j] = left + up;
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}
// @lc code=end
