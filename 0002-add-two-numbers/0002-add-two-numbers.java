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
        ListNode resultNode=new ListNode(-1);
        ListNode resultNodeHead=resultNode;

        int carrier=0;
        int sum=0;
        while(l1!=null && l2!=null){
            sum=l1.val+l2.val+carrier;

            resultNode.next=new ListNode(sum%10);
            carrier=sum/10;
            resultNode=resultNode.next;
            l1=l1.next;
            l2=l2.next;
        }

        while(l1!=null){
            sum=l1.val+carrier;

            resultNode.next=new ListNode(sum%10);
            carrier=sum/10;
            resultNode=resultNode.next;
            l1=l1.next;
        }

        while(l2!=null){
            sum=l2.val+carrier;

            resultNode.next=new ListNode(sum%10);
            carrier=sum/10;
            resultNode=resultNode.next;
            l2=l2.next;
        }

        if(carrier>0)
            resultNode.next=new ListNode(carrier);
        return resultNodeHead.next;
    }
}