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
    public void flatten(TreeNode root) {

        if (root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode lastNode = root;
        stack.push(root);

        while(stack.isEmpty() == false){
            TreeNode node = stack.pop();

            if(node.right != null) {
                stack.push(node.right);
            }

            if(node.left != null) {
                stack.push(node.left);
            }

            if(lastNode == node) continue;

            lastNode.left = null;
            lastNode.right = node;
            lastNode = node;
        }


    }
}
