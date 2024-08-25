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
    
    int sum=0;
    public int maxLevelSum(TreeNode root) {
        List<Integer> levelSum = new ArrayList<Integer>();
        if (root == null) return 0;
        helper(root, 0,levelSum);

        int maxSum= Integer.MIN_VALUE;
        int ans=0;
       for (int i = 0; i < levelSum.size(); i++) {
            if (maxSum < levelSum.get(i)) {
                maxSum = levelSum.get(i);
                ans = i + 1;
            }
       }
        return ans;
    }


    
    public void helper(TreeNode node, int level, List<Integer> levelSum) {
        // start the current level
        if (levelSum.size() == level) levelSum.add(node.val);
        else
            levelSum.set(level,levelSum.get(level)+node.val);


        // process child nodes for the next level
        if (node.left != null) helper(node.left, level + 1, levelSum);
        if (node.right != null) helper(node.right, level + 1, levelSum);
    }

}