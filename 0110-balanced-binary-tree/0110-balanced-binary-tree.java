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
    public boolean isBalanced(TreeNode root) {
        if(maxDepth(root, 0)==-1){
            return false;
        }
        return true;
    }
    
    public int maxDepth(TreeNode root, int depth){
        if(root==null){
            return depth;
        }
        int left = maxDepth(root.left, depth+1);
        int right = maxDepth(root.right, depth+1);
        if(left==-1 || right == -1){
            return -1;
        }
        if(Math.abs(left-right)<=1){
            return Math.max(left,right);
        }
        return -1;
    }
    
}