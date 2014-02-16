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
    public boolean hasCycle(ListNode head) {
        if (head==null) return false;
        HashSet<ListNode> set = new HashSet<ListNode>();
        ListNode p = head;
        ListNode q = head.next;
        while ((p!=null) && (q!=null)) {
            if (p==q) return true;
            p = p.next;
            q = q.next;
            if (q!=null) q=q.next;
        }
        return false;
    }
}