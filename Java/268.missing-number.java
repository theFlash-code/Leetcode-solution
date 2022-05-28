/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        int[] cnt = new int[nums.length+1];
        for(int i=0; i<nums.length; ++i){
            cnt[nums[i]]++;
        }
        for(int i=0; i<cnt.length; ++i){
            if(cnt[i] == 0){
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end

