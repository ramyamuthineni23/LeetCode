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
    int maxSum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPath(root);
        return maxSum;
    }

    public int maxPath(TreeNode root){
        if(root==null)
            return 0;
        int gainFromLeft=Math.max(maxPath(root.left),0);
        int gainFromRight=Math.max(maxPath(root.right),0);

        maxSum=Math.max(maxSum, gainFromLeft+gainFromRight+root.val);

        return Math.max(gainFromLeft+root.val, gainFromRight+root.val);
    }
}