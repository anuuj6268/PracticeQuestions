/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        if(head.next==null){
            return false;
        }
        ListNode slowest = head;
        ListNode fast = head;
        while(fast!=null){
            if(slowest==null){
                return false;
            }
            slowest = slowest.next;
            if(fast.next==null){
                return false;
            }
            fast = fast.next.next;
        if(slowest==fast){
            return true;
        }
        }

return false;
    }
}