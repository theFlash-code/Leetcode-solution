/*
 * @lc app=leetcode id=581 lang=java
 *
 * [581] Shortest Unsorted Continuous Subarray
 */

// @lc code=start
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] copy = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            copy[i] = nums[i];
        }
        Arrays.sort(copy);
        int start = -1, end = -1;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != copy[i]) {
                if (start == -1)
                    start = i;
                else
                    end = i;
            }
        }
        return end == start ? 0 : end - start + 1;
    }
}
// @lc code=end
