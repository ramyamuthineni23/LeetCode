/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int MAX_D = 0;
    public int diameterOfBinaryTree(TreeNode root) {
         if(root == null) return 0;
        int d = maxDepth(root);
        return MAX_D;
    }
    public int maxDepth(TreeNode node){
        if(node == null){
            return 0;
        }
        int leftDepth = maxDepth(node.left);
        int rightDepth = maxDepth(node.right);
        MAX_D = Math.max(MAX_D, Math.abs(leftDepth+rightDepth));
        return 1 + Math.max(leftDepth, rightDepth);
    }
}