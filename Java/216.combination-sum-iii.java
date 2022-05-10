/*
 * @lc app=leetcode id=216 lang=java
 *
 * [216] Combination Sum III
 */

// @lc code=start
class Solution {
    List<List<Integer>> res;

    public List<List<Integer>> combinationSum3(int k, int n) {
        res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        dfs(k, n, cur, 0, 0);
        return res;
    }

    public void dfs(int k, int n, List<Integer> cur, int sum, int last) {
        if (sum == n && cur.size() == k) {
            res.add(new ArrayList<>(cur));
        }
        for (int i = last + 1; i < 10; ++i) {
            cur.add(i);
            dfs(k, n, cur, sum + i, i);
            cur.remove(cur.size() - 1);
        }
    }
}
// @lc code=end
