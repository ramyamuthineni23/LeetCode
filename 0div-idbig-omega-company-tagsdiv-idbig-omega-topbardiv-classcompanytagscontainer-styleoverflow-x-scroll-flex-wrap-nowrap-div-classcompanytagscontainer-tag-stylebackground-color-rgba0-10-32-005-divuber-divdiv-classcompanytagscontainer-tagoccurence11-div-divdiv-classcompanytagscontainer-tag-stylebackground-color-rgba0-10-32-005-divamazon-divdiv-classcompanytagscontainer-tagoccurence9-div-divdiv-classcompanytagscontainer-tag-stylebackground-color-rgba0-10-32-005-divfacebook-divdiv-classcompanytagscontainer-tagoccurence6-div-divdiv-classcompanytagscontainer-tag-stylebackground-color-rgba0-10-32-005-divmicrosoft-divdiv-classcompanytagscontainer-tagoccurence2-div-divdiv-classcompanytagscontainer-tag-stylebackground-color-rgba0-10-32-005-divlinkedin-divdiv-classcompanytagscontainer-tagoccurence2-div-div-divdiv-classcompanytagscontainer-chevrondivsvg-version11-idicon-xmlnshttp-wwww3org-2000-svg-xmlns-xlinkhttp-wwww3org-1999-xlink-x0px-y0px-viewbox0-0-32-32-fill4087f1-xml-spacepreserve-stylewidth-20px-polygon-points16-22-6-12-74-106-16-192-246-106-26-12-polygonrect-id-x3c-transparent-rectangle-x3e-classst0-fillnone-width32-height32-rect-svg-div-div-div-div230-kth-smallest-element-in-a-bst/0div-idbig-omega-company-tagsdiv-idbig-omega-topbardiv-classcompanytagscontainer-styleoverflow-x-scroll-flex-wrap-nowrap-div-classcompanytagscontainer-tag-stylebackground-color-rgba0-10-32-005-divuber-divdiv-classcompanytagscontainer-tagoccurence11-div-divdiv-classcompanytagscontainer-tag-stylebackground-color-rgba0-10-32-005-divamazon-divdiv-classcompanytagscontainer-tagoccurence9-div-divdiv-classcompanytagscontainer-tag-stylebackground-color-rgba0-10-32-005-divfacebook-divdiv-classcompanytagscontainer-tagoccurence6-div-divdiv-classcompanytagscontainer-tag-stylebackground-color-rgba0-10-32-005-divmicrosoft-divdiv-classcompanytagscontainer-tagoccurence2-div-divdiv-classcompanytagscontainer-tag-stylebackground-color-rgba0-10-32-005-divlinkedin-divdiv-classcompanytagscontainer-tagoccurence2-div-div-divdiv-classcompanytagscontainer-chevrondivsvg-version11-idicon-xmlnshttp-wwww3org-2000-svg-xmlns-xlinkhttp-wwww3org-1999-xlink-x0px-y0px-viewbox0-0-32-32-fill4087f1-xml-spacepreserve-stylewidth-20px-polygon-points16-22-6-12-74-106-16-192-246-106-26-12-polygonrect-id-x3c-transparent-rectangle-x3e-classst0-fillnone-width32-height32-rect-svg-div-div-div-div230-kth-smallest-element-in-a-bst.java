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
    ArrayList<Integer> arrayList=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        
        kthSmall(root);
        return arrayList.get(k-1);
    }
    public void kthSmall(TreeNode root){
        if(root==null)
            return;
        kthSmall(root.left);
        arrayList.add(root.val);
        kthSmall(root.right);
    }
}