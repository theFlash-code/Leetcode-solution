/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = merge(nums1, nums2);
        int midlen = nums.length/2;
        if(nums.length%2 == 0){
            return (double)(nums[midlen]+nums[midlen-1])/2;
        }
        return nums[midlen];
    }
    public int[] merge(int[] nums1, int[] nums2){
        int[] res = new int[nums1.length+nums2.length];
        int i=0, j=0, k=0;
        for(; i<nums1.length && j<nums2.length; ++k){
            if(nums1[i] < nums2[j])
                res[k] = nums1[i++];
            else
                res[k] = nums2[j++];
        }
        for(; i<nums1.length; ++i){
            res[k++] = nums1[i];
        }
        for(; j<nums2.length; ++j){
            res[k++] = nums2[j];
        }
        return res;
    }
}
// @lc code=end

