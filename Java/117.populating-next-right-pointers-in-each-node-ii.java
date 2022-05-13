/*
 * @lc app=leetcode id=117 lang=java
 *
 * [117] Populating Next Right Pointers in Each Node II
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    List<Node> nodes;
    public Node connect(Node root) {
        nodes = new ArrayList<>();
        dfs(0,root);
        return root;
    }
    public void dfs(int depth, Node node){
        if(node == null) return;
        if(nodes.size()>depth){
            Node left = nodes.get(depth);
            left.next = node;
            nodes.remove(depth);
        }
        nodes.add(depth, node);
        dfs(depth+1, node.left);
        dfs(depth+1, node.right);
    }
}
// @lc code=end

