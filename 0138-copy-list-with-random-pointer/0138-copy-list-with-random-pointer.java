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
        Node temp=head;

        HashMap<Node,Node> hashMap=new HashMap<>();

        while(temp!=null){
            hashMap.put(temp,new Node(temp.val));
            temp=temp.next;
        }
        temp=head;

        while(temp!=null){
            Node clone=hashMap.get(temp);
            clone.next=hashMap.get(temp.next);
            clone.random=hashMap.get(temp.random);
            temp=temp.next;
        }
        return hashMap.get(head);
    }
}