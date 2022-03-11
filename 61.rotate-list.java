/*
 * @lc app=leetcode id=61 lang=java
 *
 * [61] Rotate List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return head;
        ListNode cur = head;
        ListNode fast = cur;
        int length = 0;
        while (fast.next != null) {
            length++;
            fast = fast.next;
        }
        length++;
        k %= length;
        for (int i = 0; i < length - k - 1; ++i) {
            cur = cur.next;
        }
        fast.next = head;
        head = cur.next;
        cur.next = null;

        return head;
    }
}
// @lc code=end
