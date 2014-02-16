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
    public boolean checkMirror(TreeNode n1, TreeNode n2) {
        if ((n1==null) && (n2==null)) return true;
        if ((n1==null) || (n2==null)) return false;
        return ((n1.val==n2.val) && checkMirror(n1.left, n2.right) && checkMirror(n1.right, n2.left));
    }
    
    public boolean isSymmetric(TreeNode root) {
        if (root==null) return true;
        return checkMirror(root.left,root.right);
    }
}