/*
 * @lc app=leetcode id=1641 lang=java
 *
 * [1641] Count Sorted Vowel Strings
 */

// @lc code=start
class Solution {
    Set<String> set;

    public int countVowelStrings(int n) {
        int a = 1, e = 1, i = 1, o = 1, u = 1;
        int res = 5;
        for (int j = 1; j < n; ++j) {
            a = a + e + i + o + u;
            e = e + i + o + u;
            i = i + o + u;
            o = o + u;
            u = u;
            res = a + e + i + o + u;
        }
        return res;
    }
}
// @lc code=end
