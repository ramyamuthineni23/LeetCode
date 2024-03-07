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
class BSTIterator {
    ArrayList<Integer> arrayList;
    int index;
    public BSTIterator(TreeNode root) {
        this.arrayList=new ArrayList<>();
        this.index=0;
        inOrder(root);
    }
    public void inOrder(TreeNode root){
        if(root==null){
            return ;
        }
        inOrder(root.left);
        this.arrayList.add(root.val);
        inOrder(root.right);
    }
    
    public int next() {
        return this.arrayList.get(index++);
    }
    
    public boolean hasNext() {
        return index<this.arrayList.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */