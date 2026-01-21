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
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        this.traverse(root, result);

        return result;
    }

    private void traverse(TreeNode node, List<Integer> result) {

        if(node == null) return;

        this.traverse(node.left, result);
        this.traverse(node.right, result);
        result.add(node.val);

    }
}