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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode result = new ListNode();
        ListNode head = result;

        int more = 0;

        while (result != null) {
            int v1 = l1 != null ? l1.val : 0;
            int v2 = l2 != null ? l2.val : 0;

            v1 += v2;

            if (more > 0) {
               v1 += more;
               more = 0; 
            }
            
            if (v1 / 10 >= 1) {
                v1 -= 10;
                more = 1;
            }

            result.val = v1;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;

            result.next = (l1 != null || l2 != null || more > 0) ? new ListNode() : null;

            result = result.next;

        }

        return head;
    }
}