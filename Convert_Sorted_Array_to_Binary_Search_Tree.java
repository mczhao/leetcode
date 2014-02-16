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
    public TreeNode makeBST(int[] num, int start, int end) {
        if (start>end) return null;
        else if (start==end) return new TreeNode(num[start]);
        else {
            int mid = (start+end)/2;
            TreeNode node = new TreeNode(num[mid]);
            node.left = makeBST(num, start, mid-1);
            node.right = makeBST(num, mid+1, end);
            return node;
        }
    }
    
    public TreeNode sortedArrayToBST(int[] num) {
        TreeNode root = makeBST(num, 0, num.length-1);
        return root;
    }
}