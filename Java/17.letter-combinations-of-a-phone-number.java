/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start
class Solution {
    Set<String> set;
    String[] map;

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0)
            return new ArrayList<>();
        set = new HashSet<>();
        map = new String[] { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        dfs(0, digits, "");
        return new ArrayList<>(set);
    }

    public void dfs(int ind, String digits, String cur) {
        if (cur.length() == digits.length()) {
            set.add(cur);
            return;
        }
        String letters = map[digits.charAt(ind) - '2'];
        for (int i = 0; i < letters.length(); ++i) {
            dfs(ind + 1, digits, cur + letters.charAt(i));
        }
    }
}
// @lc code=end
