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
    int sum;
    
    void dfs(TreeNode n, int pathValue) {
        if ((n.left==null) && (n.right==null)) sum += pathValue*10+n.val;
        else {
            if (n.left!=null) dfs(n.left, pathValue*10+n.val);
            if (n.right!=null) dfs(n.right, pathValue*10+n.val);
        }
    }
    
    public int sumNumbers(TreeNode root) {
        sum = 0;
        if (root == null) return 0;
        dfs(root, 0);
        return sum;
    }
}