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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;

        int count = 0 ;

        if(head.next == null ){
            return null;
        }
        if( head.next.next == null){
            head.next = null;
            return head;
        }
        while(temp.next != null){
            count++;
            temp = temp.next;
        }
        System.out.print(count);
        
        if(count%2==0)count= count/2-1;
        else count = count/2;

        ListNode prev = head;
        ListNode  ft = prev;
        while(count != 0){
            prev = prev.next ;
            ft = ft.next;
            count--;

        }

        prev.next = ft.next.next;
        return head;
    }
}