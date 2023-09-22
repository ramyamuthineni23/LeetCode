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
        if(head==null||head.next==null||k==0)
            return head;
        int len=length(head);
        while(k>=len){
            k=k-len;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(k>0&&fast.next!=null)
        {
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
    public int length(ListNode head){
        int count=0;
        while(head!=null){
            head=head.next;
        count++;
        }
        return count;
    }
}