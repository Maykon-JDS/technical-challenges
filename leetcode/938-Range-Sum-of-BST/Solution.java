/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {

        Stack<TreeNode> LIFO = new Stack<TreeNode>();

        LIFO.push(root);

        Integer total = 0;

        while (!(LIFO.isEmpty())) {

            TreeNode node = LIFO.pop();

            if (node.val >= low && node.val <= high) {
                total += node.val;
            }

            if (node.left != null && node.val > low) {
                LIFO.push(node.left);
            }

            if (node.right != null && node.val < high) {
                LIFO.push(node.right);
            }

        }

        return total;

    }
}