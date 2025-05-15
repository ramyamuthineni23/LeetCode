class Solution {
    LinkedList<Integer> leftView = new LinkedList<>();
    int maxDep = 1;
    public int widthOfBinaryTree(TreeNode root) {
        if (root==null){
            return 0;
        }
        traverse(root, 1, 1);
        return maxDep;
    }
    public void traverse(TreeNode root, int id, int depth){
        if (root==null){
            return;
        }
        if (leftView.size()==depth-1){
            leftView.addLast(id);
        } else {
            maxDep = Math.max(maxDep, (id-leftView.get(depth-1)+1));
        }
        traverse(root.left, 2*id, depth+1);
        traverse(root.right, 2*id+1, depth+1);
    }
}