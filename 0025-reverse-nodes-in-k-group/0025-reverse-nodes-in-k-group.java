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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode ptr=head;

        ListNode tail=null;

        ListNode newHead=null;
        while(ptr!=null){
            ptr=head;
            int count=0;

            while(count<k && ptr!=null){
                
                count++;
                ptr=ptr.next;
            }
            if(k==count){
                ListNode revHead=reversedGroup(head,k);

                if(newHead==null) newHead=revHead;

                if(tail!=null) tail.next=revHead;

                tail=head;
                head=ptr;
            }
        }

        if(tail!=null) tail.next=head;

        return (newHead==null)? head: newHead;
    }
    public ListNode reversedGroup(ListNode head,int k){
        ListNode curr=head;
        ListNode prev=null;
        
        while(k>0){
            ListNode next=curr.next;   
            curr.next=prev;
            prev=curr;
            curr=next;
            k--;
        }
        return prev;
}
}