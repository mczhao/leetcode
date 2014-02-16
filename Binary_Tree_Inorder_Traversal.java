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
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        LinkedList<TreeNode> nodeStack = new LinkedList<TreeNode>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        TreeNode p = root;
        boolean done = false;
        while (!done) {
            if (p!=null) {
                nodeStack.addFirst(p);
                p = p.left;
            } else {
                if (nodeStack.size() == 0) {
                    done = true;
                } else {
                    p = nodeStack.removeFirst();
                    res.add(new Integer(p.val));
                    p = p.right;
                }
            }
        }
        return res;
    }
}