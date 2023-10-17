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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        int height=height(root);
        int itr=1;
        for(int i=0;i<height;i++){
            List<Integer> subRes=new ArrayList<>();
            levelBylevel(root, subRes, i,itr);
            res.add(subRes);
            itr=itr*-1;
        }
        return res;
    }
    public int height(TreeNode root){
        if(root==null)
            return 0;
        int l=height(root.left)+1;
        int r=height(root.right)+1;
        return Math.max(l,r);
    }
    public void levelBylevel(TreeNode root, List<Integer> subRes, int i, int itr){
        if(root==null)
            return;
        if(i==0) subRes.add(root.val);
        if(itr>0){
            levelBylevel(root.left,subRes,i-1, itr);
            levelBylevel(root.right,subRes,i-1, itr);
        }
        if(itr<0){
            levelBylevel(root.right,subRes,i-1, itr);
            levelBylevel(root.left,subRes,i-1, itr);
        }
    }
    
}