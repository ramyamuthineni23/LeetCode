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
    List<List<Integer>> res;
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        res=new ArrayList<>();
        
        //List<Integer> subRes=new ArrayList<>();
        levelBylevel(root, 0);
        //res.add(subRes);
    
        return res;
    }
    
    public void levelBylevel(TreeNode root, int i){
        if(root==null)
            return;
        if(res.size()==i)
        res.add(new ArrayList<>());

        res.get(i).add(root.val);
        
        levelBylevel(root.left,i+1);
        levelBylevel(root.right,i+1);
    }
}