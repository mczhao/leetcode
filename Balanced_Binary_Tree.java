/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BoolAndInt {
    boolean isBalanced;
    int height;
    public BoolAndInt(boolean b, int v) {
        isBalanced = b;
        height = v;
    }
}

public class Solution {
    public BoolAndInt myIsBalanced(TreeNode root) {
        if (root==null) return new BoolAndInt(true, 0);
        else {
            BoolAndInt res1 = myIsBalanced(root.left);
            BoolAndInt res2 = myIsBalanced(root.right);
            int height = Math.max(res1.height, res2.height)+1;
            if (res1.isBalanced && res2.isBalanced && (Math.abs(res1.height-res2.height)<=1)) {
                return new BoolAndInt(true, height);
            } else {
                return new BoolAndInt(false, height);
            }
        }
    }
    
    public boolean isBalanced(TreeNode root) {
        BoolAndInt res = myIsBalanced(root);
        return res.isBalanced;
    }
}