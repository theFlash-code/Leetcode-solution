/*
 * @lc app=leetcode id=647 lang=java
 *
 * [647] Palindromic Substrings
 */

// @lc code=start
class Solution {
    public int countSubstrings(String s) {
        int n = s.length(), res = 0;
        boolean[][] dp = new boolean[n][n];
        for(int i=0; i<n; ++i){
            dp[i][i] = true;
            res += 1;
        }
        for(int i=0; i<n-1; ++i){
            if(s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = true;
                res += 1;
            }
        }
        for(int i=2; i<n; ++i){
            for(int j=0; j+i<n; ++j){
                if(s.charAt(j) == s.charAt(j+i)){
                    dp[j][j+i] = dp[j+1][j+i-1];
                    if(dp[j][j+i]) res += 1;
                }
            }
        }
        return res;
    }
}
// @lc code=end

