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
    public TreeNode recoverFromPreorder(String traversal) {
        int index=0;
        Stack<TreeNode> stack=new Stack<>();
        while(index<traversal.length()) {
            int depth=0;
            // depth
            while(index<traversal.length() && traversal.charAt(index)=='-'){
                index++;
                depth++;
            }

            int value=0;
            //extract the value
            while(index<traversal.length() && Character.isDigit(traversal.charAt(index))){
                value=value*10 + (traversal.charAt(index)-'0');
                index++;
            }

            TreeNode currNode=new TreeNode(value);

            //pop values greater than depth;
            while(stack.size()>depth){
                stack.pop();
            }

            if(!stack.isEmpty()){
                if(stack.peek().left==null)
                    stack.peek().left=currNode;
                else{
                    stack.peek().right=currNode;
                }
            }
            stack.push(currNode);
        }
        while(stack.size()>1){
            stack.pop();
        }
        return stack.peek();
        

    }
}