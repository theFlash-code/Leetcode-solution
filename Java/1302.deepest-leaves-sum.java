/*
 * @lc app=leetcode id=1302 lang=java
 *
 * [1302] Deepest Leaves Sum
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
    Map<Integer, Integer> map;
    int max;
    public int deepestLeavesSum(TreeNode root) {
        map = new HashMap<>();
        max = 0;
        dfs(root, 0);
        return map.get(max);
    }
    public void dfs(TreeNode node, int depth){
        if(node == null) return;
        max = Math.max(max, depth);
        map.put(depth, map.getOrDefault(depth, 0)+node.val);
        dfs(node.left, depth+1);
        dfs(node.right, depth+1);
    }
}
// @lc code=end

