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
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> result = new ArrayList<>();

        if (root == null) return new ArrayList<>();

        if (root.left == null && root.right == null) {
            result.add(String.valueOf(root.val));
            return result;
        }

        List<Integer> temp = new ArrayList<>();
        result = this.recursiveHelper(root, temp);
        return result;
    }

    public List<String> recursiveHelper (TreeNode node, List<Integer> temp) {

        List<String> result = new ArrayList<>();

        temp.add(node.val);

        if (node.left == null && node.right == null) {
            String joinned = temp.stream().map(String::valueOf).collect(Collectors.joining("->"));
            result.add(joinned);
            return result;
        }

        if(node.left != null) {
            result.addAll(this.recursiveHelper(node.left, new ArrayList<>(temp)));
        }

        if(node.right != null) {
           result.addAll(this.recursiveHelper(node.right, new ArrayList<>(temp)));
        }

        return result;
    }
}