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
    public int sumOfLeftLeaves(TreeNode root) {

        if(root == null) return 0;

        return this.helper(root.left, false) + this.helper(root.right, true);
    }

    public int helper(TreeNode root, boolean direction) {

        if(root == null) return 0;

        if (
            direction == false &&
            root.right == null &&
            root.left == null
        ) {
            return root.val;
        }

        return this.helper(root.left, false) + this.helper(root.right, true);
    }
}