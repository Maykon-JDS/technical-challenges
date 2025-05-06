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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if(root == null) return result;

        Deque<TreeNode> queue = new ArrayDeque<>();

        queue.add(root);

        int level = 0;
        List<Integer> levelArray = new ArrayList<>();

        TreeNode lastNodeLevel = root;

        while(!queue.isEmpty()){

            TreeNode node = queue.peekFirst();
            levelArray.add(node.val);

            if(node.left != null){
                queue.add(node.left);
            }

            if(node.right != null){
                queue.add(node.right);
            }

            if(node == lastNodeLevel){
                result.add(levelArray);
                levelArray = new ArrayList<>();
                level++;
                lastNodeLevel = queue.peekLast();
            }

            queue.removeFirst();
        }

        return result;
    }
}