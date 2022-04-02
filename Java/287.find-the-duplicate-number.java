/*
 * @lc app=leetcode id=287 lang=java
 *
 * [287] Find the Duplicate Number
 */

// @lc code=start
class Solution {
    public int findDuplicate(int[] nums) {
        int[] map = new int[nums.length];
        for(int i=0; i<nums.length; ++i){
            if(map[nums[i]]==1) return nums[i];
            map[nums[i]]++;
        }
        return -1;
    }
}
// @lc code=end

