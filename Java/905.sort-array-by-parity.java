/*
 * @lc app=leetcode id=905 lang=java
 *
 * [905] Sort Array By Parity
 */

// @lc code=start
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int odd=nums.length-1, even=0;
        int[] res = new int[nums.length];
        for(int i=0; i<nums.length; ++i){
            if(nums[i]%2 == 0){
                res[even++] = nums[i];
            }else{
                res[odd--] = nums[i];
            }
        }
        return res;
    }
}
// @lc code=end

