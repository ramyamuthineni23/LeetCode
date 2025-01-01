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
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        
        ListNode first=head;
        ListNode newHead=reversedList(slow);
        ListNode second=newHead;

        while(second!=null){
            if(first.val!=second.val){
                reversedList(newHead);
                return false;
            }
            
            first=first.next;
            second=second.next;
        }

        reversedList(newHead);

        return true;

        
    }
    public ListNode reversedList(ListNode head){
        ListNode curr=head;
        ListNode prev=null;

        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}