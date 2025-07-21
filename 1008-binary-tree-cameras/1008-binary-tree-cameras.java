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
    int cameraCount = 0;

    public int minCameraCover(TreeNode root) {
        // If root is not covered, add one camera
        if (dfs(root) == 0) {
            cameraCount++;
        }
        return cameraCount;
    }

    // Return the state of the current node
    private int dfs(TreeNode node) {
        if (node == null) {
            return 2; // Null nodes are considered covered
        }

        int left = dfs(node.left);
        int right = dfs(node.right);

        if (left == 0 || right == 0) {
            // If any child is not covered, put a camera here
            cameraCount++;
            return 1; // This node has a camera
        }

        if (left == 1 || right == 1) {
            // If any child has a camera, this node is covered
            return 2; // Covered but no camera
        }

        // If children are covered but they have no cameras
        return 0; // This node is not covered
    }
}
