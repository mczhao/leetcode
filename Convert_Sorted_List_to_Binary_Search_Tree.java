/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
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
    public TreeNode buildBST(ArrayList<ListNode> list, int start, int end) {
        if (start>end) return null;
        if (start==end) return new TreeNode(list.get(start).val);
        int mid = (start+end)/2;
        TreeNode left = buildBST(list, start, mid-1);
        TreeNode right = buildBST(list, mid+1, end);
        TreeNode root = new TreeNode(list.get(mid).val);
        root.left = left;
        root.right = right;
        return root;
    }
    
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<ListNode>();
        ListNode p = head;
        while (p!=null) {
            list.add(p);
            p = p.next;
        }
        return buildBST(list, 0, list.size() - 1);
    }
}