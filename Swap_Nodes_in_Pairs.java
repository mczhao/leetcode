/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head==null) return head;
        if (head.next==null) return head;
        ListNode p = head;
        ListNode q = head.next;
        ListNode newHead = new ListNode(0);
        ListNode prev = newHead;
        while (q!=null) {
            prev.next = q;
            ListNode tp = q.next;
            q.next = p;
            prev = p;
            p = tp;
            if (p!=null) q = p.next;
            else q = null;
        }
        if (p!=null) {
            prev.next = p;
            p.next = null;
        } else prev.next = null;
        return newHead.next;
    }
}