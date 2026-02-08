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
    public ListNode partition(ListNode head, int x) {
        ListNode l1Head = new ListNode(0);
        ListNode l2Head = new ListNode(0);
        ListNode l1 = l1Head;
        ListNode l2 = l2Head;
       
        ListNode temp = head;

        while (temp != null) {
            if (temp.val < x) {
                l1.next = temp;
                l1 = l1.next;
            } else {
                l2.next = temp;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        l2.next = null;
        l1.next = l2Head.next;

        return l1Head.next;
    }
}