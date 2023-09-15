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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
  
 if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode h1=list1;
        ListNode h2=list2;
        ListNode temp=new ListNode(0,null);
        ListNode tempHead=temp;
        while(h1!=null && h2!=null)
        {
            if(h1.val<=h2.val){
                
                temp.next=h1;
                h1=h1.next;
            }
            else{
                temp.next=h2;
                h2=h2.next;
            }
            temp=temp.next;
        }
          while(h1!=null)
        {   
                temp.next=h1;
                h1=h1.next;
                temp=temp.next;
        }
        while(h2!=null)
        {   
                temp.next=h2;
                h2=h2.next;
                temp=temp.next;

        }
        return tempHead.next;

    }
}