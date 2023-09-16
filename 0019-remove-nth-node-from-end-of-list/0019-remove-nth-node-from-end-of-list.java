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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(n>1){
            fast=fast.next;
            n--;
        }
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next;
        }
        if(prev==null){
            return head.next;
        }
        if(slow==null){
            prev.next=null;
        }
        prev.next=slow.next;
        return head;
    }
}