/**
 *
 * https://leetcode.com/problems/invert-binary-tree/submissions/1505572864
 *
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
    public TreeNode invertTree(TreeNode root) {

        if (root == null) {

            return null;

        }

        TreeNode temp;

        temp = root.right;
        root.right = root.left;
        root.left = temp;

        if ( root.right != null ) {

            root.right = this.invertTree(root.right);

        }

        if ( root.left != null  ) {

            root.left = this.invertTree(root.left);

        }

        return root;
    }
}