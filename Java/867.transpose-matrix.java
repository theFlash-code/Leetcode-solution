/*
 * @lc app=leetcode id=867 lang=java
 *
 * [867] Transpose Matrix
 */

// @lc code=start
class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] res = new int[matrix[0].length][matrix.length];
        for(int i=0; i<res.length; ++i){
            for(int j=0; j<res[0].length; ++j){
                res[i][j] = matrix[j][i];
            }
        }
        return res;
    }
}
// @lc code=end

