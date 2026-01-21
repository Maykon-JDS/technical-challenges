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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        Deque<TreeNode> stackP = new ArrayDeque<>();
        Deque<TreeNode> stackQ = new ArrayDeque<>();

        stackP.push(p);
        stackQ.push(q);

        while (!stackP.isEmpty() || !stackQ.isEmpty()) {

            TreeNode nodeP = stackP.pop();
            TreeNode nodeQ = stackQ.pop();

            if (nodeP == null || nodeQ == null) {
                if (nodeP != nodeQ) {
                    return false;
                }
                continue; // skip further comparison
            }

            if (nodeP != null && nodeQ != null) {
                if (nodeP.val != nodeQ.val) {
                    return false;
                }
            }

            if (nodeP.left == null || nodeQ.left == null) {
                if (nodeP.left != nodeQ.left) {
                    return false;
                }
            }

            if (nodeP.left != null) {
                stackP.push(nodeP.left);
                stackQ.push(nodeQ.left);
            }

            if (nodeP.right == null || nodeQ.right == null) {
                if (nodeP.left != nodeQ.left) {
                    return false;
                }
            }

            if (nodeP.right != null) {
                stackP.push(nodeP.right);
                stackQ.push(nodeQ.right);
            }

        }

        return true;

    }

}