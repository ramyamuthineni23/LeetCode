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
        ListNode resultNode=new ListNode(-1);
        ListNode resultNodeHead=resultNode;


        while(list1!=null && list2!=null){
            System.out.println("Whileloop1: "+list1.val);
            if(list1.val<=list2.val){
                resultNode.next=list1;
                list1=list1.next;
                
            }
            
            else{
                resultNode.next=list2;
                list2=list2.next;
            }
            resultNode=resultNode.next;
        }
           if(list1!=null){
                resultNode.next=list1;
                
            }
            if(list2!=null){
                resultNode.next=list2;
                
            }
        
        return resultNodeHead.next;
    }
}