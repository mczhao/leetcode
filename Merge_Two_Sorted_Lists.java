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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null) return l2;
        if (l2==null) return l1;
        ListNode head = new ListNode(-1);
        ListNode p = l1;
        ListNode q = l2;
        ListNode l = head;
        while ((p!=null) || (q!=null)) {
            if ((p==null) || ((q!=null) && (q.val<=p.val))) {
                l.next = q;
                l = l.next;
                q = q.next;
            } else {
                l.next = p;
                l = l.next;
                p = p.next;
            }
        }
        return head.next;
    }
}