/*
 * @lc app=leetcode id=82 lang=java
 *
 * [82] Remove Duplicates from Sorted List II
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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return head;
        ListNode res = head;
        Stack<ListNode> st = new Stack<>();
        while (head != null) {
            if (st.isEmpty() || st.peek().val != head.val) {
                st.push(head);
            } else {
                ListNode tgt = st.pop();
                while (head != null && tgt.val == head.val) {
                    head = head.next;
                }
                if (!st.isEmpty())
                    st.peek().next = head;
                else
                    res = head;
                st.push(head);
            }
            head = head == null ? null : head.next;
        }
        return res;
    }
}
// @lc code=end
