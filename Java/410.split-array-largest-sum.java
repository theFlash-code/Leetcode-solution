/*
 * @lc app=leetcode id=410 lang=java
 *
 * [410] Split Array Largest Sum
 */

// @lc code=start
class Solution {
    public int splitArray(int[] nums, int m) {
        int[][] dp = new int[m][nums.length];
        // int[] sum = new int[nums.length+1];
        int s = 0;
        for(int i=0; i<nums.length; ++i){
            s+=nums[i];
            // sum[i+1] = s;
            dp[0][i] = s;
        }
        for(int i=1; i<dp.length; ++i){
            for(int j=0; j<nums.length; ++j){
                dp[i][j] = Math.max(dp[i-1][0], dp[0][j]-dp[0][0]);
                for(int k=1; k<j; ++k){
                    dp[i][j] = Math.min(dp[i][j], Math.max(dp[i-1][k], dp[0][j]-dp[0][k]));
                }
            }
        }
        return dp[m-1][nums.length-1];
    }
}
// @lc code=end

