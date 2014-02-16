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
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        LinkedList<TreeNode> nodeStack = new LinkedList<TreeNode>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (root == null) return res;
        nodeStack.addLast(root);
        while (nodeStack.size() != 0) {
            TreeNode node = nodeStack.removeLast();
            res.add(new Integer(node.val));
            if (node.right != null) nodeStack.addLast(node.right);
            if (node.left != null) nodeStack.addLast(node.left);
        }
        return res;
    }
}