/*
 * @lc app=leetcode id=71 lang=java
 *
 * [71] Simplify Path
 */

// @lc code=start
class Solution {
    public String simplifyPath(String path) {
        String[] dir = path.split("/");
        Stack<String> st = new Stack<>();
        for (String d : dir) {
            if (d.equals("..")) {
                if (!st.isEmpty())
                    st.pop();
            } else if (!d.equals(".") && !d.equals("")) {
                st.push(d);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.insert(0, "/" + st.pop());
        }
        return sb.toString() == "" ? "/" : sb.toString();
    }
}
// @lc code=end
