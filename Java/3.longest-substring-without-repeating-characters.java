import java.util.*;

/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        Set<Character> set = new HashSet<>();
        int i=0, j=0, max = 0;
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            }else{
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }
}
// @lc code=end
/*
""abcabcbb"
"bbbbb"
"pwwkew"
""
"abcdefghijklmnopqrstuvwxyz"
" "
"abb""
*/