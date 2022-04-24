/*
 * @lc app=leetcode id=230 lang=java
 *
 * [230] Kth Smallest Element in a BST
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        addList(list, root.left, k);
        list.add(root.val);
        addList(list, root.right, k);
        // Collections.sort(list);
        return list.get(k - 1);
    }

    public void addList(List<Integer> list, TreeNode root, int k) {
        if (root == null || list.size() == k)
            return;
        addList(list, root.left, k);
        list.add(root.val);
        addList(list, root.right, k);
    }
}
// @lc code=end
