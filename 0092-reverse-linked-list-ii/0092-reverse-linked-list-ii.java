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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp=head;
           ListNode prev=null;
        while(left>1){
            left--;
            prev=temp;
            temp=temp.next;
            right--;
        }
        ListNode conn=prev, tail=temp;
        while(right>0){
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
            right--;
        }
        
        if(conn!=null){
            conn.next=prev;
        }
        else{
             head=prev;    
        }
        tail.next=temp;
        return head;
    }
}