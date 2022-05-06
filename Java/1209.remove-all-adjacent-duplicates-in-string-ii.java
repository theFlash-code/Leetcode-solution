/*
 * @lc app=leetcode id=1209 lang=java
 *
 * [1209] Remove All Adjacent Duplicates in String II
 */

// @lc code=start
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Data> st = new Stack<>();
        for(int i=0; i<s.length(); ++i){
            if(!st.isEmpty() && st.peek().c == s.charAt(i)){
                st.peek().cnt++;
                if(st.peek().cnt == k){
                    st.pop();
                }
            }else{
                Data d = new Data(1, s.charAt(i));
                st.push(d);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Data d: st){
            for(int i=0; i<d.cnt; ++i){
                sb.append(d.c);
            }
        }
        return sb.toString();
    }
    class Data{
        int cnt;
        char c;
        Data(int count, char ch){
            cnt = count;
            c = ch;
        }
    }
}
// @lc code=end

