/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        Node tail = head;
                Node newNode = new Node(x);
        if(head==null){
            head = newNode;
            return head;
        }
        if(head.next==null){
            head.next = newNode;
            return head;
            
        }
        while(tail.next!=null){
            tail = tail.next;
        }

        tail.next = newNode;
        return head;
    }
}