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
    ArrayList<ArrayList<Integer>> res;
    
    void levelOrderTraversal(TreeNode node, int level) {
        if (node==null) return;
        if (res.size() < level+1) res.add(new ArrayList<Integer>());
        ArrayList<Integer> levelList = res.get(level);
        levelList.add(new Integer(node.val));
        levelOrderTraversal(node.left, level+1);
        levelOrderTraversal(node.right, level+1);
    }
    
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        res = new ArrayList<ArrayList<Integer>>();
        levelOrderTraversal(root, 0);
        return res;
    }
}