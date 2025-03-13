/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        List<TreeNode> FIFO = new ArrayList<TreeNode>();

        FIFO.add(cloned);

        while(!(FIFO.isEmpty())){

            TreeNode node = FIFO.remove(0);

            if(node.val == target.val){
                return node;
            }

            if(!(node.left == null)){
                FIFO.add(node.left);
            }

            if(!(node.right == null)){
                FIFO.add(node.right);
            }

        }

        return target;

    }
}