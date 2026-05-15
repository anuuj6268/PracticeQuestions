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

    public ListNode middle(ListNode head){
   


        ListNode slower = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slower = slower.next;
            fast = fast.next.next;
        }
        return slower;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next == null){
            return true;
        }
        ListNode mid = middle(head);

        ListNode prev = null;
        ListNode curr = mid;
        ListNode nextt;
        ListNode left = head;
        ListNode right;
       while(curr!=null){
        nextt = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextt;
       }
right = prev;

while(right!=null){
    if(left.val != right.val){
        return false;
    }
    left = left.next;
    right = right.next;
}
return true;
    }
}