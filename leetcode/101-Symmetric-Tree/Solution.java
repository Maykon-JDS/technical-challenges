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
    public boolean isSymmetric(TreeNode root) {

        if(root.left == null && root.right == null){
            return true;
        }

        if(root.left == null || root.right == null){
            return false;
        }

        Deque<TreeNode> queueLeft = new LinkedList<>();
        Deque<TreeNode> queueRight = new LinkedList<>();

        queueLeft.add(root.left);
        queueRight.add(root.right);

        while(!queueLeft.isEmpty() || !queueRight.isEmpty()) {

            TreeNode nodeLeft = queueLeft.removeFirst();
            TreeNode nodeRight = queueRight.removeFirst();

            if (nodeLeft == null && nodeRight == null) continue;
            if (nodeLeft == null || nodeRight == null) return false;
            if (nodeLeft.val != nodeRight.val) return false;

            queueLeft.add(nodeLeft.left);
            queueRight.add(nodeRight.right);

            queueLeft.add(nodeLeft.right);
            queueRight.add(nodeRight.left);

        }

        return true;

    }
}