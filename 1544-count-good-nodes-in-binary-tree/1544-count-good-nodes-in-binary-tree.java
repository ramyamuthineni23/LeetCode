/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count=0;
    public int goodNodes(TreeNode root) {
        int maxSofar=Integer.MIN_VALUE;
        goods(root,maxSofar);
        return count;
    }
    public void goods(TreeNode root, int maxSofar){
        if(root==null)
        return;
        if(root.val>=maxSofar){
            count++;
            maxSofar=root.val;
        }

        goods(root.left,maxSofar);
        goods(root.right,maxSofar);
        return;
    }

}