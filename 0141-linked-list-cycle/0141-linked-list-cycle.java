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
    public boolean hasCycle(ListNode header) {
        if(header==null){
            return false;
        }
        if(header.next==null){
            return false;
        }
        ListNode slow = header;
        ListNode fast = header;
        while(fast!=null){
            if(slow==null){
                return false;
            }
            slow = slow.next;
            if(fast.next==null){
                return false;
            }
            fast = fast.next.next;
        if(slow==fast){
            return true;
        }
        }

return false;
    }
}