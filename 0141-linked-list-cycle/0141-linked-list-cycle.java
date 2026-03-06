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
        ListNode slower = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slower = slower.next;
            fast = fast.next.next;
            
            if(slower==fast){
                return true;
            }

        }


return false;
    }
}