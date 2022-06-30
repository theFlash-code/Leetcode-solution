/*
 * @lc app=leetcode id=462 lang=java
 *
 * [462] Minimum Moves to Equal Array Elements II
 */

// @lc code=start
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1, res = 0;
        for (; i < j; i++, j--) {
            res += nums[j] - nums[i];
        }
        return res;
    }
}
// @lc code=end
