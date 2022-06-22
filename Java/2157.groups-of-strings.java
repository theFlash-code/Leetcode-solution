/*
 * @lc app=leetcode id=2157 lang=java
 *
 * [2157] Groups of Strings
 */

// @lc code=start
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
// @lc code=end

