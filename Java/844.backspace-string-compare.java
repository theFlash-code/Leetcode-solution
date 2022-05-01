/*
 * @lc app=leetcode id=844 lang=java
 *
 * [844] Backspace String Compare
 */

// @lc code=start
class Solution {
    public boolean backspaceCompare(String S, String T) {
        return build(S).equals(build(T));
    }
    public String build(String str){
        Stack<Character> ans = new Stack<>();
        for(char c: str.toCharArray()){
            if(c != '#'){
                ans.push(c);
            }else {
                if(!ans.empty()){
                    ans.pop();
                }
            }
        }
        return String.valueOf(ans);
    }
}
// @lc code=end

