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
    public ListNode removeNthFromEnd(ListNode head, int nth) {
        ListNode slow = head;
        ListNode temp = head;

        int count = 0;
        ListNode fast = head;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        if(count==nth){
    head = head.next;
    return head;
}
        for(int i = 0;i<nth;i++){
            fast = fast.next;
       
        }

while(fast.next!=null){
    slow = slow.next;
    fast = fast.next;

}
if(head.next==null){
    return null;
}


slow.next = slow.next.next;
return  head;
    }
    }