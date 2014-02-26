/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int minDepth(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        if (root == null) return 0;
        queue.addLast(root);
        int i = 1;
        while (queue.size()!=0) {
            LinkedList<TreeNode> newQueue = new LinkedList<TreeNode>();
            while (queue.size()!=0) {
                TreeNode n = queue.removeFirst();
                if ((n.left==null) && (n.right==null)) return i;
                if (n.left!=null) newQueue.addLast(n.left);
                if (n.right!=null) newQueue.addLast(n.right);
            }
            queue = newQueue;
            i++;
        }
        return 0;
    }
}