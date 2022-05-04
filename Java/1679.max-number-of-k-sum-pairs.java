/*
 * @lc app=leetcode id=1679 lang=java
 *
 * [1679] Max Number of K-Sum Pairs
 */

// @lc code=start
class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int res = 0;
        for (int key : map.keySet()) {
            int v = map.getOrDefault(k - key, 0), ke = map.get(key);
            res += Math.min(v, ke);
        }
        return res / 2;
    }
}
// @lc code=end
