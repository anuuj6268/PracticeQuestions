/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        Node curr = head;
        Node nextt;
        Node prevv = null;
        
        
        while(curr!=null){
            nextt = curr.next;
            curr.next = prevv;
            curr.prev = nextt;
            prevv = curr;
            curr = nextt;
        }
        head = prevv;
        
        return head;
    }
}