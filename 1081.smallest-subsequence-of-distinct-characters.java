/*
 * @lc app=leetcode id=1081 lang=java
 *
 * [1081] Smallest Subsequence of Distinct Characters
 */

// @lc code=start
class Solution {
    public String smallestSubsequence(String s) {
        char[] charArr = s.toCharArray();
        int[] count = new int[26];
        for (char c : charArr) {
            count[c - 'a']++;
        }
        boolean[] used = new boolean[26];
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < charArr.length; ++i) {
            char c = charArr[i];
            count[c - 'a']--;
            if (used[c - 'a'] == true)
                continue;
            while (!st.isEmpty() && st.peek() > c && count[st.peek() - 'a'] > 0) {
                used[st.peek() - 'a'] = false;
                st.pop();
            }
            st.push(c);
            used[c - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : st) {
            sb.append(c);
        }
        return sb.toString();

    }
}
// @lc code=end
