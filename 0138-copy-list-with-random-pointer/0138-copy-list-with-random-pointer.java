/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        Node newHead=new Node(0);
        Node temp=newHead;
        HashMap<Node,Node> hashMap=new HashMap<>();
        while(head!=null){
            temp.next=new Node(head.val);
            temp.next.random=head.random;
            hashMap.put(head,temp.next);
            temp=temp.next;
            head=head.next;
        }
        temp=newHead.next;
        while(temp!=null){
            temp.random=hashMap.get(temp.random);
            temp=temp.next;
        }
        return newHead.next;
    }
}