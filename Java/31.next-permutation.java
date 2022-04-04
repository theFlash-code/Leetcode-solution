/*
 * @lc app=leetcode id=31 lang=java
 *
 * [31] Next Permutation
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {
        for(int i=nums.length-1; i>0; --i){
            if(nums[i]>nums[i-1]){
                for(int j=nums.length-1; j>=i; --j){
                    if(nums[j]>nums[i-1]){
                        int t = nums[j];
                        nums[j] = nums[i-1];
                        nums[i-1] = t;
                        break;
                    }
                }
                for(int j=i, k=nums.length-1; j<k; ++j, --k){
                    int t = nums[k];
                    nums[k] = nums[j];
                    nums[j] = t;
                }
                return;
            }
        }
        for(int i=0, j=nums.length-1; i<nums.length/2; ++i, --j){
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
        return;
    }
}
// @lc code=end

