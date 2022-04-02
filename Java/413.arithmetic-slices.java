/*
 * @lc app=leetcode id=413 lang=java
 *
 * [413] Arithmetic Slices
 */

// @lc code=start
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length-2; ++i){
            int j=i+1, cur = 0;
            int dif = nums[j]-nums[i];
            while(j<nums.length-1 && nums[j+1]-nums[j]==dif){
                j++;
                cur++;
            }
            sum += cur;
        }
        return sum;
    }
}
// @lc code=end

