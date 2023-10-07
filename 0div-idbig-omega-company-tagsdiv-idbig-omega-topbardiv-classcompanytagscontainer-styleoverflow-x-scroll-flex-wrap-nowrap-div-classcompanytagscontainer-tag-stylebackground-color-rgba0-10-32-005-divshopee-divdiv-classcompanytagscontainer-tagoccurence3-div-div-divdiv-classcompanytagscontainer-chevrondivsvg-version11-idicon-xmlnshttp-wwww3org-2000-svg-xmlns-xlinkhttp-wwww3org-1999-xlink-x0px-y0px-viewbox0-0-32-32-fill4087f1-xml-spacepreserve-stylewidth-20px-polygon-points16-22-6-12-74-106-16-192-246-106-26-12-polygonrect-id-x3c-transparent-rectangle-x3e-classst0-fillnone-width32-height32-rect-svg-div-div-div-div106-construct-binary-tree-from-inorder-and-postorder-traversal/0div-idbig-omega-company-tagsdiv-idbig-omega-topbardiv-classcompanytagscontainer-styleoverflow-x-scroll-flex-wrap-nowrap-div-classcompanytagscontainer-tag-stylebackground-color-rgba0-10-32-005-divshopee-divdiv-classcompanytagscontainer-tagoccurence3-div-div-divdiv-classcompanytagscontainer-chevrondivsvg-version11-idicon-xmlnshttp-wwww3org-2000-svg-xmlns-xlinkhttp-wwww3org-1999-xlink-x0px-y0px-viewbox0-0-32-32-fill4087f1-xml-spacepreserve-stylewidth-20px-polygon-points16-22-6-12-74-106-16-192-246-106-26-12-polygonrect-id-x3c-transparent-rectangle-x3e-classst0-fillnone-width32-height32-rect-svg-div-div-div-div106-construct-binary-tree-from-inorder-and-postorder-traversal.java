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
    int postIndex=0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex=inorder.length-1;
        return build(postorder,inorder,0, inorder.length-1);
        
    }
    public TreeNode build(int[] postorder,int[] inorder,int is,int ie){
        if(is>ie)
            return null;
        TreeNode root=new TreeNode(postorder[postIndex--]);
        int inIndex=-1;
        for(int i=is;i<=ie;i++)
        {
            if(inorder[i]==root.val)
            {   inIndex=i;
                break;
            }
        }
        
        root.right=build(postorder,inorder,inIndex+1, ie);
        root.left=build(postorder,inorder,is,inIndex-1);
        return root;
        
    }
    
}