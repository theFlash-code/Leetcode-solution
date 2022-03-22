/*
 * @lc app=leetcode id=1663 lang=java
 *
 * [1663] Smallest String With A Given Numeric Value
 */

// @lc code=start
class Solution {
    public String getSmallestString(int n, int k) {
        char[] charr = new char[n];
        k -= n;
        int i = n - 1;
        while (k >= 25) {
            k -= 25;
            charr[i--] = 'z';
        }
        if (i < 0)
            return String.valueOf(charr);
        charr[i--] = (char) ('a' + k);
        for (; i >= 0; --i) {
            charr[i] = 'a';
        }
        return String.valueOf(charr);
    }
}
// @lc code=end
