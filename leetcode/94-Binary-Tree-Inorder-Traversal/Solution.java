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
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> inorder = new ArrayList<>();

        if (root == null) return inorder;

        inorder.add(root.val);

        if (root.left == null && root.right == null) return inorder;

        inorder = this.helper(root);

        return inorder;

    }

    public List<Integer> helper(TreeNode node) {

        if (node == null) return null;

        List<Integer> result = new ArrayList<>();

        if (node.left == null && node.right == null)
        {
            result.add(node.val);
            return result;
        }

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        left = helper(node.left);
        right = helper(node.right);

        if(left != null) {
            result.addAll(left);
        }

        result.add(node.val);

        if(right != null) {
            result.addAll(right);
        }

        return result;
    }
}