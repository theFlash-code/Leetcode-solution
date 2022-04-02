/*
 * @lc app=leetcode id=138 lang=java
 *
 * [138] Copy List with Random Pointer
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return head;
        Map<Node, Node> map = new HashMap<>();
        Node res = new Node(0);
        Node cur = res;
        Node node = head;
        int i = 0;
        while(node != null){
            cur.val = node.val;
            cur.next = node.next==null? null:new Node(0);
            map.put(node, cur);
            i++;
            cur = cur.next;
            node = node.next;
        }
        cur = null;
        cur = res;
        node = head;
        while(node != null){
            cur.random = node.random==null? null:map.get(node.random);
            cur = cur.next;
            node = node.next;
        }
        return res;
    }
}
// @lc code=end

