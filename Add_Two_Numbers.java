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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode pl1 = l1;
        ListNode pl2 = l2;
        ListNode result = new ListNode(0);
        ListNode pr = result;
        int d = 0;
        while (!((pl1==null) && (pl2==null))) {
            int sum = d;
            if (pl1 != null) {
                sum+=pl1.val;
                pl1 = pl1.next;
            }
            if (pl2 != null) {
                sum+=pl2.val;
                pl2 = pl2.next;
            }
            pr.next = new ListNode(sum%10);
            d = sum/10;
            pr = pr.next;
        }
        if (d != 0) pr.next = new ListNode(d);
        return result.next;
    }
}