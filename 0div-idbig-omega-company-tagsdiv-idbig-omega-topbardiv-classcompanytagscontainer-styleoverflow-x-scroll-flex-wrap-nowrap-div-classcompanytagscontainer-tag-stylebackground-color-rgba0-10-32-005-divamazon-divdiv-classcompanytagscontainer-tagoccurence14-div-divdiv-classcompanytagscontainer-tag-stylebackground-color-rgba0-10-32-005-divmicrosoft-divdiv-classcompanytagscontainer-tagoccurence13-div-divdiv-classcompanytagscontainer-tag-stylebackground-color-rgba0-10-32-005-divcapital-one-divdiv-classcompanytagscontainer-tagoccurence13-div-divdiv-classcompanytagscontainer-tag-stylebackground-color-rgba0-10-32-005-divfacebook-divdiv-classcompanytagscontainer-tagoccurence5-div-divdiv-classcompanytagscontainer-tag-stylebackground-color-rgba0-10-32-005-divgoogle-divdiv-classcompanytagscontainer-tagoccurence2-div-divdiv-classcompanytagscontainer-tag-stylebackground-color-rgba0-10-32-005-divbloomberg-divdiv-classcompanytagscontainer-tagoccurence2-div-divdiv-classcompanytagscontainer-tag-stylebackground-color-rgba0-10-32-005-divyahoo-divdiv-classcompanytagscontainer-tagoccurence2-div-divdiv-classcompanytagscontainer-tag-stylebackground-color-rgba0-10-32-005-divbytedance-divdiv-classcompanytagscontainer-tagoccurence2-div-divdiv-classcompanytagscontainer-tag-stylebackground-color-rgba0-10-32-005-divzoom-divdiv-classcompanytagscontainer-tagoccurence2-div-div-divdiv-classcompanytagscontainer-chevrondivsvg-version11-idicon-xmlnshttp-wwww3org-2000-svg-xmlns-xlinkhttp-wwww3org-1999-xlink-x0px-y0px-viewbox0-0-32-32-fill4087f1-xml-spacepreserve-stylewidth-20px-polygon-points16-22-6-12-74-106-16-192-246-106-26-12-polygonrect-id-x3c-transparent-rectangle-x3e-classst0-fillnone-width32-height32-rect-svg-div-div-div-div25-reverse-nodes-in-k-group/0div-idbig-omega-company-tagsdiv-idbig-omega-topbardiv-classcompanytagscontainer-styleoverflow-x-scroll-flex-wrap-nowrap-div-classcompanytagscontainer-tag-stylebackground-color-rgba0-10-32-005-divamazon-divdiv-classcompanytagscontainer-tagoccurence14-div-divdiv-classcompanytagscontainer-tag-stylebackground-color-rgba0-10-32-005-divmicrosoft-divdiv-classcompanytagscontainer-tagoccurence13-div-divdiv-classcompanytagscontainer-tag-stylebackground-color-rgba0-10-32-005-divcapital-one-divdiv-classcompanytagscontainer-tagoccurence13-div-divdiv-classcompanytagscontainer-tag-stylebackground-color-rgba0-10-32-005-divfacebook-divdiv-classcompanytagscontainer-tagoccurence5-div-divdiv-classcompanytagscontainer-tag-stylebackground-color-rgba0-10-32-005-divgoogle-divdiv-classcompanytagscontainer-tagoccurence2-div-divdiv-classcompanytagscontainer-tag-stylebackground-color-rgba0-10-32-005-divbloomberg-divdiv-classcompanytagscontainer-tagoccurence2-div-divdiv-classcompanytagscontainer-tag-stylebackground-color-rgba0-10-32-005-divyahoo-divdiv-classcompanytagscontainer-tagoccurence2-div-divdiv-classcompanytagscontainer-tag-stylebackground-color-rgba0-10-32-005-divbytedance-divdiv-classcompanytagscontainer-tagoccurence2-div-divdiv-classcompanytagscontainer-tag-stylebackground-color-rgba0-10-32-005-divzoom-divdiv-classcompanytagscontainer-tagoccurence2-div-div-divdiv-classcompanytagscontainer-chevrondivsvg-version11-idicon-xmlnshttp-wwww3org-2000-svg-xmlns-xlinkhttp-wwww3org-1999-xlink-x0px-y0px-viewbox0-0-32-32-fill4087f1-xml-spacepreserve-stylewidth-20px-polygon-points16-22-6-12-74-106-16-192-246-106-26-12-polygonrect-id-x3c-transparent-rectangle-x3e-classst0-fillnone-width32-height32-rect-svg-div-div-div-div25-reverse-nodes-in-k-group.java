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
        
        ListNode result=new ListNode(0);
        ListNode tail=result;
          if(k == 1) return head;
        //1. count group
        int group_count = 0;
        ListNode temp_head = head;
        while(temp_head != null){
            group_count++;
            temp_head = temp_head.next;
        }
        group_count /= k;
        while(group_count-->0){
            int count=0;
            ListNode tail_node=head;
            ListNode cur=head;
            ListNode prev=null;
            while(cur!=null && count<k){
                
                ListNode next=cur.next;
                cur.next=prev;
                prev=cur;
                cur=next;
                count++;
            }
            tail.next=prev;
            tail=tail_node;
            head=cur;
            
        }
        
        if(head!=null){
            
            tail.next=head;
        }
        return result.next;
    }
}