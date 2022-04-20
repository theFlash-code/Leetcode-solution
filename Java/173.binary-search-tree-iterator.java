/*
 * @lc app=leetcode id=173 lang=java
 *
 * [173] Binary Search Tree Iterator
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
class BSTIterator {
    List<Integer> list;
    int cur;

    public BSTIterator(TreeNode root) {
        list = new ArrayList<>();
        helper(root);
        cur = 0;
    }

    public void helper(TreeNode root) {
        if (root == null)
            return;
        helper(root.left);
        list.add(root.val);
        helper(root.right);
    }

    public int next() {
        return list.get(cur++);
    }

    public boolean hasNext() {
        return cur < list.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
// @lc code=end
