/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
            return true;
        if (t.length() == 0)
            return false;
        int j = 0;
        for (int i = 0; i < t.length(); ++i) {
            if (s.charAt(j) == t.charAt(i)) {
                j++;
                if (j == s.length())
                    return true;
            }
        }
        return false;
    }
}
// @lc code=end
