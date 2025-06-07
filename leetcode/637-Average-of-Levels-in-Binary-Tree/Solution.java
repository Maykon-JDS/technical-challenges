import java.util.*;

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
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> results = new ArrayList<>();

        Deque<TreeNode> queue = new ArrayDeque<>();

        queue.add(root);

        TreeNode lastNodeLevel = root;
        TreeNode nextLastNodeLevel = null;
        int qtd = 1;
        Double sum = 0.0;
        int level = 0;

        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            sum += node.val;

            if (node.right != null) {
                queue.add(node.right);
                nextLastNodeLevel = node.right;
            }


            if (node.left != null) {
                queue.add(node.left);
                nextLastNodeLevel = node.left;
            }

            if (lastNodeLevel == node) {
                results.add(level, (sum / qtd));
                ++level;
                lastNodeLevel = nextLastNodeLevel;
                qtd = 0;
                sum = 0.0;
            }

            ++qtd;
        }

        return results;
    }
}