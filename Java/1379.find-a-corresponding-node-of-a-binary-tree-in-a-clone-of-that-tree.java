/*
 * @lc app=leetcode id=1379 lang=java
 *
 * [1379] Find a Corresponding Node of a Binary Tree in a Clone of That Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode res;

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        res = null;
        getNode(target, original, cloned);
        return res;
    }

    public void getNode(TreeNode target, TreeNode node1, TreeNode node2) {
        if (node1 == null)
            return;
        if (node1 == target) {
            res = node2;
            return;
        }
        getNode(target, node1.left, node2.left);
        getNode(target, node1.right, node2.right);
    }
}
// @lc code=end
