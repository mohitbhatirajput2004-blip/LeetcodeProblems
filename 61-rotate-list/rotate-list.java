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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        int count = 1;
        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
            count++;
        }

        k = k % count;
        if (k == 0) return head;

        int p = count - k - 1;
        ListNode curr = head;
        for (int i = 0; i < p ; i++) {
            curr = curr.next;
        }

        ListNode ans = curr.next;
        curr.next = null;
        temp.next = head;

        return ans;        
    }
}