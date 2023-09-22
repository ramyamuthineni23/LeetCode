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
        ListNode lessthan=new ListNode(0);

        ListNode greaterthan=new ListNode(0);
        ListNode temp=head;
        ListNode less=lessthan;
        ListNode greater=greaterthan;
        while(temp!=null){
            if(temp.val<x){
                lessthan.next=new ListNode(temp.val);
                lessthan=lessthan.next;
            }
            else{
                greaterthan.next=new ListNode(temp.val);
                greaterthan=greaterthan.next;
            }
            temp=temp.next;
        }
        lessthan.next=greater.next;
        
        return less.next;
    }
}