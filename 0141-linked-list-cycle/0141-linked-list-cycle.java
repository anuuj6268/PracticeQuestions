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
        ListNode slow = header;
        ListNode faster = header;
        while (faster != null && faster.next != null) {
            slow = slow.next;
            faster = faster.next.next;

            if (slow == faster) {
                return true;
            }

        }

        return false;
    }
}