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
    TreeNode pre = null;
    
    public void flatten(TreeNode root) {
        if (root == null) return;
        TreeNode leftBranch = root.left;
        TreeNode rightBranch = root.right;
        if (pre == null) pre = root;
        else {
            pre.right = root;
            pre.left = null;
            pre = pre.right;
        }
        flatten(leftBranch);
        flatten(rightBranch);
    }
}