/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1=headA;
        ListNode t2=headB;

        int l1=0,l2=0;

        while(t1!=null){
            l1+=1;
            t1=t1.next;
        }
        while(t2!=null){
            l2+=1;
            t2=t2.next;
        }

        t1=headA;
        t2=headB;
        int diff=l1-l2;

        if(diff<0){
            while(diff!=0)
            {   diff++;
                t2=t2.next;
            }
        }
        else{
            while(diff!=0)
            {   diff--;
                t1=t1.next;
            }
        }
        
        while(t2!=null){
            if(t1==t2)
            return t1;
            t1=t1.next;
            t2=t2.next;
        }
        return null;
    }
}