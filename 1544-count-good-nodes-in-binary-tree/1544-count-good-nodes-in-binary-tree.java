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
    int softMax=Integer.MIN_VALUE;
    public int goodNodes(TreeNode root) {
        countingGoodNodes(root,softMax);
        return count;
    }
    public void countingGoodNodes(TreeNode root, int softMax){
        if(root==null)
            return ;
        if(root.val>=softMax){
            count++;
            softMax=root.val;
        }
        countingGoodNodes(root.left, softMax);
        countingGoodNodes(root.right, softMax);
    }
}