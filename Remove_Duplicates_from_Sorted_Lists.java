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
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> nodeSet = new HashSet<Integer>();
        ListNode p = head;
        ListNode q = head;
        while (p!=null) {
            if (!nodeSet.contains(p.val)) {
                nodeSet.add(new Integer(p.val));
                q = p;
                p = p.next;
            } else {
                q.next = p.next;
                p = p.next;
            }
        }
        return head;
    }
}