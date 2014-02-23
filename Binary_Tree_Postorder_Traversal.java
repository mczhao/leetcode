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
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (root==null) return res;
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        TreeNode p = root;
        list.addFirst(p);
        while (list.size() != 0) {
            p = list.removeFirst();
            res.add(new Integer(p.val));
            if (p.left!=null) list.addFirst(p.left);
            if (p.right!=null) list.addFirst(p.right);
        }
        Collections.reverse(res);
        return res;
    }
}