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
    ArrayList<ArrayList<Integer>> upToDown;
    void preOrderTraverse(TreeNode node, int level) {
        if (node==null) return;
        if (upToDown.size()<=level) {
            upToDown.add(new ArrayList<Integer>());
        }
        upToDown.get(level).add(new Integer(node.val));
        preOrderTraverse(node.left,level+1);
        preOrderTraverse(node.right,level+1);
    }
    
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        upToDown = new ArrayList<ArrayList<Integer>>();
        preOrderTraverse(root,0);
        Collections.reverse(upToDown);
        return upToDown;
    }
}