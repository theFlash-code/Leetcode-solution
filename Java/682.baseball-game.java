/*
 * @lc app=leetcode id=682 lang=java
 *
 * [682] Baseball Game
 */

// @lc code=start
class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<ops.length; ++i){
            if(ops[i].equals("D")){
                st.push(st.peek()*2);
            }else if(ops[i].equals("C")){
                st.pop();
            }else if(ops[i].equals("+")){
                int n1 = st.pop();
                int n2 = st.peek();
                st.push(n1);
                st.push(n1+n2);
            }else{
                st.push(Integer.parseInt(ops[i]));
            }
        }
        int res = 0;
        List<Integer> list = new ArrayList<>(st);
        for(int n: st){
            res += n;
        }
        return res;
    }
}
// @lc code=end

