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
    
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        res = new ArrayList<ArrayList<Integer>>();
        if (root == null) return res;
        ArrayList<TreeNode> list = new ArrayList<TreeNode>();
        list.add(root);
        int level = 0;
        while (list.size() != 0) {
            ArrayList<Integer> subRes = new ArrayList<Integer>();
            if (level % 2 == 0) {
                for (int i=0; i<list.size(); i++) subRes.add(new Integer(list.get(i).val));
            } else {
                for (int i=list.size()-1; i>=0; i--) subRes.add(new Integer(list.get(i).val));
            }
            res.add(subRes);
            ArrayList<TreeNode> newList = new ArrayList<TreeNode>();
            for (TreeNode node: list) {
                if (node.left != null) newList.add(node.left);
                if (node.right != null) newList.add(node.right);
            }
            list = newList;
            level++;
        }
        return res;
    }
}