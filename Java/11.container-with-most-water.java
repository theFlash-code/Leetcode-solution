/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int i=0, j=height.length-1;
        while(i<j){
            if(height[i]>height[j]){
                max = Math.max(max, height[j]*(j-i));
                j--;
            }else{
                max = Math.max(max, height[i]*(j-i));
                i++;
            }
        }
        return max;
    }
}
// @lc code=end

