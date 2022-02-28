/*
 * @lc app=leetcode id=662 lang=java
 *
 * [662] Maximum Width of Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();
        Pair<TreeNode, Integer> rootPair = new Pair<>(root, 1);
        q.add(rootPair);
        int max = 0;
        while(!q.isEmpty()){
            int cnt = q.size();
            int start=1, end=1;
            for(int i=0; i<cnt; ++i){
                Pair<TreeNode, Integer> p = q.poll();
                TreeNode cur = p.getKey();
                int ind = p.getValue();
                if(i==0) start = ind;
                if(i==cnt-1) end = ind;
                if(cur.left != null)
                    q.add(new Pair<TreeNode, Integer>(cur.left, ind*2));
                if(cur.right != null)
                    q.add(new Pair<TreeNode, Integer>(cur.right, ind*2+1));
                
            }
            int width = end-start+1;
            max = Math.max(max, width);
        }
        return max;
    }
}
// @lc code=end

