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
        ListNode temp=head;
        if(head==null)
        return head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        k=k%size;
        ListNode slow=head;
        ListNode fast=head;
        while(k!=0){
            fast=fast.next;
            k--;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=head;
        head=slow.next;
        slow.next=null;
return head;
    }
}