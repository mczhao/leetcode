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
    private int calcMaxDep(TreeNode root, HashMap<TreeNode, Integer> map) {
        if (map.containsKey(root)) return map.get(root);
        else {
            if ((root.left == null) && (root.right == null)) {
                map.put(root, new Integer(root.val));
                return root.val;
            } else {
                int leftMax = 0;
                int rightMax = 0;
                if (root.left != null) leftMax = calcMaxDep(root.left, map);
                if (root.right != null) rightMax = calcMaxDep(root.right, map);
                int currMax = Math.max(root.val, Math.max(root.val+leftMax, root.val+rightMax));
                map.put(root, new Integer(currMax));
                return currMax;
            }
        }
    }
    
    private int calcMaxPath(TreeNode root, HashMap<TreeNode, Integer> map) {
        if ((root.left == null) && (root.right == null)) {
            return root.val;
        } else {
            int leftMaxPath = Integer.MIN_VALUE;
            int rightMaxPath = Integer.MIN_VALUE;
            if (root.left != null) leftMaxPath = calcMaxPath(root.left, map);
            if (root.right != null) rightMaxPath = calcMaxPath(root.right, map);
            int res = Math.max(Math.max(Math.max(leftMaxPath, rightMaxPath), map.get(root)), root.val+(root.left==null?0:map.get(root.left))+(root.right==null?0:map.get(root.right)));
            return res;
        }
    }
    
    public int maxPathSum(TreeNode root) {
        HashMap<TreeNode, Integer> maxDep = new HashMap<TreeNode, Integer>();
        calcMaxDep(root, maxDep);
        return calcMaxPath(root, maxDep);
    }
}