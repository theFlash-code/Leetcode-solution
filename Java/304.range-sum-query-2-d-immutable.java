/*
 * @lc app=leetcode id=304 lang=java
 *
 * [304] Range Sum Query 2D - Immutable
 */

// @lc code=start
class NumMatrix {
    int[][] dp;
    public NumMatrix(int[][] matrix) {
        dp = new int[matrix.length][matrix[0].length];
        dp[0][0] = matrix[0][0];
        for(int i=1; i<matrix[0].length; ++i){
            dp[0][i] = dp[0][i-1]+matrix[0][i];
        }
        for(int i=1; i<matrix.length; ++i){
            int sum = 0;
            for(int j=0; j<matrix[0].length; ++j){
                sum += matrix[i][j];
                dp[i][j] = dp[i-1][j]+sum;
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int a = dp[row2][col2];
        int b = col1==0? 0:dp[row2][col1-1];
        int c = row1==0? 0:dp[row1-1][col2];
        int d = row1==0 || col1==0? 0:dp[row1-1][col1-1];
        return a-b-c+d;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
// @lc code=end

