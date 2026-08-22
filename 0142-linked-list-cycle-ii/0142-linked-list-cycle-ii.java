public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if(head == null) return null;
        if(head.next==null) return null;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                slow = head;
                        while(slow!=fast){
            fast = fast.next;
            slow = slow.next;
        }
        if(slow == fast){
            return slow;
        }
            }
        }

        return null;
    }
}