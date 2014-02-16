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
    public boolean isSymmetric(TreeNode root) {
        LinkedList<TreeNode> s1 = new LinkedList<TreeNode>();
        LinkedList<TreeNode> s2 = new LinkedList<TreeNode>();
        if (root == null) return true;
        if ((root.left==null) && (root.right==null)) return true;
        if ((root.left==null) || (root.right==null)) return false;
        s1.addFirst(root.left);
        s2.addFirst(root.right);
        while ((s1.size()!=0) && (s2.size()!=0)) {
            TreeNode n1 = s1.removeFirst();
            TreeNode n2 = s2.removeFirst();
            if (n1.val != n2.val) return false;
            if ((n1.left == null) && (n2.right == null)) {}
            else if ((n1.left == null) || (n2.right == null)) return false;
            else {
                s1.addFirst(n1.left);
                s2.addFirst(n2.right);
            }
            if ((n1.right == null) && (n2.left == null)) {}
            else if ((n1.right == null) || (n2.left == null)) return false;
            else {
                s1.addFirst(n1.right);
                s2.addFirst(n2.left);
            }
        }
        if ((s1.size()==0) && (s2.size()==0)) return true;
        else return false;
    }
}