/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {

        if (root == null){
            return 0;
        }

        if(root.children.isEmpty()){
            return 1;
        }

        List<Integer> levels = new ArrayList<>();

        for(Node childNode:  root.children){

            levels.add(maxDepth(childNode));

        }

        return 1 + Collections.max(levels);

    }
}