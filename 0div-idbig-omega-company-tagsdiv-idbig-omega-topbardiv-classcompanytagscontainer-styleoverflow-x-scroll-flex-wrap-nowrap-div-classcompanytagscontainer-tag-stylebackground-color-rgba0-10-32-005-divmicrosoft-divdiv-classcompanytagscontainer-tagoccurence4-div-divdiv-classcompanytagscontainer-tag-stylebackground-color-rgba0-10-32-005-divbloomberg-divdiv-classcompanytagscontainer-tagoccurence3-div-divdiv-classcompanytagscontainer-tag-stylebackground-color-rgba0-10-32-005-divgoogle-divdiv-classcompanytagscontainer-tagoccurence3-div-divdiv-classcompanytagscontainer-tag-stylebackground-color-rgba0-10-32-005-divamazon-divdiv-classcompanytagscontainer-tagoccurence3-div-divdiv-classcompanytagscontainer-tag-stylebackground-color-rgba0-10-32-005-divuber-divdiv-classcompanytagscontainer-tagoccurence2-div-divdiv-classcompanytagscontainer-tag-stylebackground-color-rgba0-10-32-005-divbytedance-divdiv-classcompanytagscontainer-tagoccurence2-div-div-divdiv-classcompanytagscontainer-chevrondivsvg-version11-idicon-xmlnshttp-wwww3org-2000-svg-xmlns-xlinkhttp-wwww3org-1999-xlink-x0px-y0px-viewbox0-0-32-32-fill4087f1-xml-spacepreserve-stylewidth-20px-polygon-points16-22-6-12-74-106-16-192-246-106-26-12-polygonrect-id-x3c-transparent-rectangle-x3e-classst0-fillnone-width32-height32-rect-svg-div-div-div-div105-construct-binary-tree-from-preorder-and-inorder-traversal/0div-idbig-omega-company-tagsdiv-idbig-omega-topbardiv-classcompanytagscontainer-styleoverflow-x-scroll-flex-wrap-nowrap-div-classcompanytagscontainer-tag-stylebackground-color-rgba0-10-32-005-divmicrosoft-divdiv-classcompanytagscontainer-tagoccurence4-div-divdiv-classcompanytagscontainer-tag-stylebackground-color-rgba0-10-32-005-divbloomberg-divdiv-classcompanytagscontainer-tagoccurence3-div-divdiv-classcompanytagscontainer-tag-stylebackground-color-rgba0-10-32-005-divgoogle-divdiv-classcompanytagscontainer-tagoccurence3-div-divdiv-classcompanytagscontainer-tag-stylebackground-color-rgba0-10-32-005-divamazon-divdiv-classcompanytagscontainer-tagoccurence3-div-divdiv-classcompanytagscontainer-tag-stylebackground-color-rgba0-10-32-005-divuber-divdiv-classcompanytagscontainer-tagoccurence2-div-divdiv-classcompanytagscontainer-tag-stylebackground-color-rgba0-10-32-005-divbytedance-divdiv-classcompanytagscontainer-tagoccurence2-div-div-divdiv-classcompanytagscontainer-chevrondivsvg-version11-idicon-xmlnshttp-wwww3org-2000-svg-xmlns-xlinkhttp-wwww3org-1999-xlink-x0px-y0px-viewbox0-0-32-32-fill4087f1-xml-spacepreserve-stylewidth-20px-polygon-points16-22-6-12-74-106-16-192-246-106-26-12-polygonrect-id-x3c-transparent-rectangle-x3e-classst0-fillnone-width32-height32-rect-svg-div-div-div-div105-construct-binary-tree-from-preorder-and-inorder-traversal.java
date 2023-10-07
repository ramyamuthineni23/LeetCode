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
    int preIndex=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,0,inorder.length-1);
        
    }
    public TreeNode build(int[] preorder,int[] inorder,int is,int ie){
        if(is>ie)
            return null;
        TreeNode root=new TreeNode(preorder[preIndex++]);
        int inIndex=-1;
        for(int i=is;i<=ie;i++){
            if(root.val==inorder[i]){
                inIndex=i;
                break;
            }
        }
        root.left=build(preorder,inorder,is,inIndex-1);
        root.right=build(preorder,inorder,inIndex+1,ie);
        return root;
        
    }
}