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
    
        if(root.val>=maxSofar){
            count++;
        }

        if(root.left!=null)
        goods(root.left,Math.max(maxSofar,root.val));
        if(root.right!=null)
        goods(root.right,Math.max(maxSofar,root.val));
        return;
    }

}