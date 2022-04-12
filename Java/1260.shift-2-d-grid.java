/*
 * @lc app=leetcode id=1260 lang=java
 *
 * [1260] Shift 2D Grid
 */

// @lc code=start
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length, m = grid[0].length;
        while (k > m * n) {
            k -= m * n;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                list.add(grid[i][j]);
            }
        }
        List<Integer> r_list = new ArrayList<>();
        int ind = list.size() - k;
        for (int i = 0; i < k; ++i) {
            r_list.add(list.get(ind++));
        }
        for (int i = k; i < list.size(); ++i) {
            r_list.add(list.get(i - k));
        }
        ind = 0;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < grid.length; ++i) {
            List<Integer> cur = new ArrayList<>();
            for (int j = 0; j < grid[0].length; ++j) {
                cur.add(r_list.get(ind++));
            }
            res.add(cur);
        }
        return res;
    }
}
// @lc code=end
