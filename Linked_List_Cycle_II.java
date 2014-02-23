/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head==null) return null;
        ListNode p = head.next;
        ListNode q = null;
        if (p!=null) q = p.next;
        while ((p!=q) && (p!=null) && (q!=null)) {
            p = p.next;
            q = q.next;
            if (q!=null) q=q.next;
        }
        if ((p==null) || (q==null)) return null;
        p = head;
        while (p!=q) {
            p = p.next;
            q = q.next;
        }
        return p;
    }
}