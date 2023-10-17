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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        
        if(root==null)
            return res;
        if(root!=null)
            queue.add(root);
        while(!queue.isEmpty()){
            double sum=0;
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode cur=queue.poll();
                sum+=cur.val;
                
                if(cur.left!=null){
                    queue.add(cur.left);
                }
                if(cur.right!=null){
                    queue.add(cur.right);
                }
                
            }
            res.add(sum/size);
        }
        return res;
    
    }
}