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
        ListNode temp1=head;
        int len=0;
        while(temp1!=null){
            temp1=temp1.next;
            len=len+1;
        }

        ListNode temp=head;

        n=len-n;
        while(n>1){
            temp=temp.next;
            n=n-1;
        }

        if(n==0)
            return head.next;

        //if(temp==null || temp.next==null)
        //return null;

        temp.next=temp.next.next;

        return head;

    }
}