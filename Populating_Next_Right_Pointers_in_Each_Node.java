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
        TreeLinkNode p = root;
        while (p!=null) {
            TreeLinkNode q = p;
            while (q!=null) {
                if (q.left!=null) q.left.next = q.right;
                if ((q.right!=null) && (q.next!=null)) q.right.next = q.next.left;
                q = q.next;
            }
            p = p.left;
        }
    }
}