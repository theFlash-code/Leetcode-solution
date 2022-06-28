/*
 * @lc app=leetcode id=1647 lang=java
 *
 * [1647] Minimum Deletions to Make Character Frequencies Unique
 */

// @lc code=start
class Solution {
    public int minDeletions(String s) {
        Map<Character, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int cnt = 0;
        for (int v : map.values()) {
            while (set.contains(v) && v > 0) {
                v--;
                cnt++;
            }
            set.add(v);
        }
        return cnt;
    }
}
// @lc code=end
