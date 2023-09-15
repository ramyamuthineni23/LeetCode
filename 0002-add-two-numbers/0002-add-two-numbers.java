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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1=l1;
        ListNode t2=l2;
        ListNode result=new ListNode(-1);
         ListNode t3=result;
         int sum=0;
         int rem=0;
         while(t1!=null || t2!=null){
             if(t1!=null){
                 sum+=t1.val;
                 t1=t1.next;
             }
             if(t2!=null){
                 sum+=t2.val;
                 t2=t2.next;
             }

             
             t3.next=new ListNode(sum%10);
             sum=sum/10;
             t3=t3.next;
         }
         if(sum>0){
             t3.next=new ListNode(sum);
         }
         return result.next;
    }
}