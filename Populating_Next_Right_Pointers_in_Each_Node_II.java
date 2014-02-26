/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if (root == null) return;
        TreeLinkNode leftMost = root;
        while (leftMost != null) {
            TreeLinkNode prev = null;
            TreeLinkNode p = leftMost;
            leftMost = null;
            while (p != null) {
                if (p.left != null) {
                    if (prev == null) {
                        prev = p.left;
                        leftMost = p.left;
                    } else {
                        prev.next = p.left;
                        prev = p.left;
                    }
                }
                if (p.right != null) {
                    if (prev == null) {
                        prev = p.right;
                        leftMost = p.right;
                    } else {
                        prev.next = p.right;
                        prev = p.right;
                    }
                }
                p = p.next;
            }
        }
    }
}