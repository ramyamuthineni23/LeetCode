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
    int result,c=0;
    public int kthSmallest(TreeNode root, int k) {
        
        kthSmall(root,k);
        return result;
    }
    public void kthSmall(TreeNode root,int k){
        if(root==null)
            return;
        kthSmall(root.left,k);
        c++;
        if(c==k)
        result=root.val;
        kthSmall(root.right,k);
    }
}