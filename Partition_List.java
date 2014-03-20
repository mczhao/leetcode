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
    public ListNode partition(ListNode head, int x) {
        ListNode sHead = new ListNode(0);
        ListNode sPtr = sHead;
        ListNode geHead = new ListNode(0);
        ListNode gePtr = geHead;
        ListNode p = head;
        while (p != null) {
            if (p.val<x) {
                sPtr.next = p;
                sPtr = sPtr.next;
                p = p.next;
            } else {
                gePtr.next = p;
                gePtr = gePtr.next;
                p = p.next;
            }
        }
        sPtr.next = geHead.next;
        gePtr.next = null;
        return sHead.next;
    }
}