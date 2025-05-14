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
        int maxheight=checkHeight(root);
        if(maxheight==-1)
            return false;
        else
            return true;
    }
    public int checkHeight(TreeNode root)
    {
        if(root==null)
            return 1;
        else
        {
            int l=checkHeight(root.left);
            int r=checkHeight(root.right);
            if(l==-1||r==-1||Math.abs(l-r)>1)
                return -1;
            else
                return 1+Math.max(l,r);
        }
    }
}