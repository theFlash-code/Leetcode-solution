/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 *
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode node = new ListNode(0);
        ListNode res = node;
        while(l1!=null || l2!=null){
            int a = l1==null? 0:l1.val;
            int b = l2==null? 0:l2.val;
            int n = a+b+carry;
            carry = n/10;
            n = n%10;
            node.next = new ListNode(n);
            node = node.next;
            l1 = l1 == null?null:l1.next;
            l2 = l2 == null?null:l2.next;
        }
        if(carry>0){
            node.next = new ListNode(carry);
        }
        return res.next;
    }
}
// @lc code=end

