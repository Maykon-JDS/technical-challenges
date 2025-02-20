/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {

        if(head == null){

            return head;

        }

        List<ListNode> nodes = new ArrayList<>();

        ListNode node = head;

        while(node != null){

            nodes.add(node);

            node = node.next;

        }

        for(int i = (nodes.size() - 1); i >= 0; i--){

            ListNode temp = nodes.get(i);

            if(i < 1){

                temp.next = null;

                break;

            }

            temp.next = nodes.get(i - 1);

            nodes.set(i, temp);

        }

        head = nodes.get(nodes.size() - 1);

        return head;

    }
}