/*
 * @lc app=leetcode id=344 lang=java
 *
 * [344] Reverse String
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        for(int i=0, j=len-1; i<len/2; ++i, --j){
            char t = s[i];
            s[i] = s[j];
            s[j] = t;
        }
    }
}
// @lc code=end

