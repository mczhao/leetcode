/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; left = null; right = null; }
 * }
 */
public class Solution {
    public ArrayList<TreeNode> generateTrees(int s, int l) {
        ArrayList<TreeNode> res = new ArrayList<TreeNode>();
        if (s == l) {
            res.add(new TreeNode(s));
        } else if (s>l) {
            res.add(null);
        } else {
            for (int i=s; i<=l; i++) {
                ArrayList<TreeNode> lSubtree = generateTrees(s, i-1);
                ArrayList<TreeNode> rSubtree = generateTrees(i+1, l);
                for (TreeNode lst: lSubtree) {
                    for (TreeNode rst: rSubtree) {
                        TreeNode tRoot = new TreeNode(i);
                        tRoot.left = lst;
                        tRoot.right = rst;
                        res.add(tRoot);
                    }
                }
            }
        }
        return res;
    }
    
    public ArrayList<TreeNode> generateTrees(int n) {
        return generateTrees(1, n);
    }
}