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
    
    public void dfs(TreeNode n, int sum, ArrayList<Integer> tRes) {
        if ((n.left==null) && (n.right==null)) {
            if (n.val == sum) {
                tRes.add(new Integer(n.val));
                res.add(tRes);
            }
            else return;
        } else {
            if (n.left != null) {
                ArrayList<Integer> tRes1 = (ArrayList<Integer>)tRes.clone();
                tRes1.add(new Integer(n.val));
                dfs(n.left, sum-n.val, tRes1);
            }
            
            if (n.right != null) {
                ArrayList<Integer> tRes1 = (ArrayList<Integer>)tRes.clone();
                tRes1.add(new Integer(n.val));
                dfs(n.right, sum-n.val, tRes1);
            }
        }
    }
    
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        res = new ArrayList<ArrayList<Integer>>();
        if (root == null) return res;
        ArrayList<Integer> tRes = new ArrayList<Integer>();
        dfs(root, sum, tRes);
        return res;
    }
}